package practice;

import java.io.File;
import java.util.Scanner;

public class AdjDigitsGreatestProduct {

	public static void main(String[] args) throws Exception {
		
		String numbers = "";
		java.io.File file = new java.io.File("input1.txt");
		Scanner input = new Scanner(file);
	
		// read the file into numbers string
		while(input.hasNext()){
			numbers += input.nextLine();
		}
		input.close();
				
		long greatest, temp_product;
		greatest = temp_product = 1;
		// initially greatest is the product of first 13 digits
		for(int i = 0; i <= 12; i++){
			greatest *= Character.getNumericValue(numbers.charAt(i));
		}
		System.out.println(greatest);
		
		for(int i = 1; i < numbers.length() - 12; i++){
			int j = i + 12;
			for(int k = i; k <= j; k++){
				temp_product *= Character.getNumericValue(numbers.charAt(k));
			}
			if(temp_product > greatest)
				greatest = temp_product;
			
			temp_product = 1;
		}
		
		System.out.println(greatest);
		
	}

}
