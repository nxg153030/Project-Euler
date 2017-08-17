package practice;

public class PythogoreanTriplet {

	public static void main(String[] args) {
		final int SUM = 1000;
		for(int a = 1; a <= SUM/3; a++){
			for(int b = a+1; b <=SUM/2; b++){
				int c = 1000 - a - b;
				if( a*a + b*b == c*c){
					System.out.println(a +" "+ b+" "+c);
					System.out.println(a*b*c);
				}
					
			}
		}

	}
}
