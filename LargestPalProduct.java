/*
 * Project Euler problem #4
 */

package practice;


import java.util.ArrayList;
import java.util.List;

public class LargestPalProduct {

	//public static void main(String[] args) {
// Solution #1
//		int p1 = 999;
//		int p2 = 999;
//		List<Integer> palArray = new ArrayList<Integer>();
//		
//		while(p1 > 99 && p2 > 99){
//			// if p1*p2 is a palindrome, store it in arraylist
//			if(isPalindrome(p1*p2)){
//				System.out.println(p1+" "+p2);
//				System.out.println(p1*p2);
//				palArray.add(p1*p2);
//				p2--;
//			}
//			else
//				p2--;
//			
//			if(p2 < 100){
//				p1--;
//				p2 = p1;
//			}
//		}
		// simple for loop to find the greatest integer in an arraylist
//		int largest = palArray.get(0);
//		for(int i = 1; i < palArray.size(); i++){
//			if(palArray.get(i) > largest)
//				largest = palArray.get(i);
//		}
//		
//		System.out.println(largest);
		
//******************************************************//
		// Solution #2
//		int biggest = 1;
//		for(int i = 999; i > 99; i--){
//			for(int j = 999; j > 99; j--){
//				if(isPalindrome(i*j) && i*j > biggest)
//					biggest = i*j;
		//	}
	//	}
		//System.out.println(biggest);
	//}
	
	public static boolean isPalindrome(int num){
		String str = Integer.toString(num);
		boolean isPal = false;
		int i = 0; int j = str.length()-1;
		
		while(i < str.length() && j > 0){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			else{
				isPal = true;
			}
			i++;
			j--;
		}
		return isPal;
	}
}
