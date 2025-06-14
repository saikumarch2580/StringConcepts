package PracticeOne;

public class DiscussionPrimeNumber1to100 {

	public static void main(String[] args) {
		primeNumber(10);
		
      
	}
	
  public static void primeNumber(int number) {
	  int primeNoCont =0;
	  for(int i=2; i<=number; i++) {
		  
		  int count =0; 
		  for(int j=2; j<i; j++) {
//			  System.out.println("Enter in 2nd loop");
			  if(i%j==0) {
				  
				  count++;
//               System.out.println("==========="+count);
			  }
		  }
		  if(count==0) {
//			  primeNoCont++;
			  System.out.println(i+ " ");
		  }
	  }
//	  System.out.println(primeNoCont +"");
  }
}
