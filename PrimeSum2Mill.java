package practice;

public class PrimeSum2Mill {

	public static void main(String[] args) {
		
		long sum = 0;
		for(long i = 2; i < 2000000; i++){
			if(isPrime(i))
				sum += i;
		}
		
		System.out.println(sum);
//		int n = 2000000;
//	    boolean[] isPrime = new boolean[n];
//	    //preprocess - set up the array
//	    for (int i = 2; i<n;i++) isPrime[i] = true;
//	    //run sieve:
//	    for (int i = 2; i < (int) Math.sqrt(n) + 1; i++) { 
//	        if (isPrime[i]) {
//	            for (int j = 2; j*i < n; j++) isPrime[i*j] = false;
//	        }
//	    }
//	    //sum primes:
//	    long sum = 0;
//	    for (int i = 2; i < n; i++) { 
//	        if (isPrime[i]) sum+=i;
//	    }
//	    System.out.println(sum);
	}
	
	public static boolean isPrime(long N){
		boolean prime = false;
		
		if(N == 1)
			return false;
		if(N == 2)
			return true;
		
		for(long i = 2; i <= Math.sqrt(N) + 1; i++){
			if(N%i == 0)
				return false;
			else
				prime = true;
		}
		
		return prime;
	}

}
