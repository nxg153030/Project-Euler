package practice;

public class EvenDivisible {

	public static void main(String[] args) {
		
	// Solution #1 to problem 5, project euler	
//		int i = 21;
//		while(!(i%2 == 0 && i%3 == 0 && i%4 == 0 && i%5 == 0 && i%7 == 0 && i%8 == 0 && i%9 == 0 &&
//				i%11 == 0 && i%12 == 0 && i%13 == 0 && i%14 == 0 && i%15 == 0 && i%16 == 0 && i%17 == 0
//				&&	i%18 == 0 && i%19 == 0 && i%20 == 0)){
//			i++;
//		}
//		System.out.println(i);
		
		// Solution #2
		int number = 2520, i = 2;
		while(i <= 20){
			if(number%i == 0){
				i++;
			}
			else{
				number++;
				i = 2;
			}
		}
		System.out.println(number);
		
	}

}
