package NaveenJava;

public class NewReverseString {

	public static void main(String[] args) {
		
		String str = "ABCD";
		
		String Reverse =" ";
		
		int len = str.length(); //4
		
		for(int i=len-1; i>=0; i--) {
			
			Reverse =  Reverse + str.charAt(i);
				
		}
		System.out.println(Reverse);

	}

}
