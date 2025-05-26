package PracticeOne;

public class DiscussionPrimeNumber1to100 {

	public static void main(String[] args) {
		primeNumber(100);
		

	}
  public static void primeNumber(int number) {
	  
	  for(int i=2; i<=number; i++) {
		  
		  int count =0; 
		  for(int j=2; j<i; j++) {
			  
			  if(i%j==0) {
				  
				  count++;
			  }
		  }
		  if(count==0) {
			  
			  System.out.println(i+ " ");
		  }
	  }
	  
  }
}
