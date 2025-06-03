package NaveenJava;

public class ReverseString {

	public static void main(String[] args) {
		String s ="Salaar";
		int s1= s.length();
		String rev ="";
		for(int i=s1-1; i>=0; i-- ) {
		//for(int i=s1-1; i>=0; i-- ) {
		rev = rev + s.charAt(i); 
		
		}
		System.out.println(rev);
	}

}
