package practice;

public class PrimeFinder {

	public static void main(String[] args) {
		
		int N = 1, primeCounter = 0;
		
		while(primeCounter != 10001){
			
			if(isPrime(N))
				primeCounter++;
			
			N++;
		}
		System.out.println(N);
		//System.out.println(isPrime(23));
	}
	
	public static boolean isPrime(int N){
		boolean prime = false;
		
		if(N == 1)
			return false;
		if(N == 2)
			return true;
		
		for(int i = 2; i < N; i++){
			if(N%i == 0)
				return false;
			else
				prime = true;
		}
		
		return prime;
	}

}
