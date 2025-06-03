package NaveenJava;

public class LargestnumberInArray {

	public static void main(String[] args) {
		int numbers[] = {1,5,15,30}; 
		
		int largenumber = numbers[0];
		int smallnumber = numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largenumber) {
				largenumber = numbers[i]; 
				  
			}else if(numbers[i]<smallnumber) {
				 
				smallnumber =numbers[i];
				 
			}
			
			
		}
		System.out.println(largenumber);
		System.out.println(smallnumber);

	}

}
