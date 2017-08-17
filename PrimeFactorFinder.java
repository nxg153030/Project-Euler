package practice;

public class PrimeFactorFinder {

	public static void main(String[] args) {
			
		long N = 600851475143L;
		
		for(int factor = 3; factor < N; factor += 2){
			while(N%factor == 0){
				N /= factor;
			}
		}
		
		System.out.println(N);
	}

	// print all prime factors of N
//	public static void primeFactorPrinter(long N){
//		
//		boolean [] primeArr = new boolean[(int)(N+1)];
//		
//		for(int i = 0; i < (int)N; i++){
//			primeArr[i] = true;
//		}
//		
//		for(int p = 2; p < N; p++){
//			if(primeArr[p] == true){
//				for(int i = 2*p; i <= N; i += p)
//					primeArr[i] = false;
//			}
//		}
//		
//		for(int i = 2; i <= N; i++){
//			if(primeArr[i] == true){
//				if(N%i == 0)
//					System.out.print(i + " ");
//			}
//		}
//		
//	}
}
