package NaveenJava;

public class EvenOddCount {

	public static void main(String[] args) {
		//Even count and odd count find
		
		int num = 2338989;

		int evenno =0;
		int oddno=0;
		
		while(num>0) {
			 
			int rem=num/10;
			if(rem/2==0) {
				
				evenno++;
			}else {
				 
				oddno++;
			}
		}
		System.out.println(evenno);
		System.out.println(oddno);
		
	}


}
