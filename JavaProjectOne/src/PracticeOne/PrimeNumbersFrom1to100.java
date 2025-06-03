package PracticeOne;

public class PrimeNumbersFrom1to100 {

	public static void main(String[] args) {
		int count = 0;
		
		
		for(int i=2; i<=100; i++) {
			boolean isprimenumber = true;
			
			for(int j=2; j<i; j++) {
			
			if(i%j==0) {
				
				isprimenumber = false;
				break;
			}
			}
			
			if(isprimenumber) {
				System.out.print(i + " ");
		}

			
 }
			
	}
	
}

