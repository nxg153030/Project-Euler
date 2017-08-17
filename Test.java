package practice;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] list = {1, 5, 6, 2, 3, 8, 10};
		System.out.println(Arrays.toString(list));
		System.out.println("Enter an offset: ");
		int offset = in.nextInt();
		int avg = average(offset, list);
		System.out.println(avg);

	}
	
	public static int average(int offset, int []list){
		int n = Math.min(offset, list.length);
		if(n <= 0)
			return 0;
		int sum = 0;
		for(int i = 0; i < n; i++)
			sum += list[i];
		return (int)sum/n;
	}

}
