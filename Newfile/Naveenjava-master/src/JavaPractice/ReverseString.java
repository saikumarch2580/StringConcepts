package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {
		String s = "My name is Sairam";
		int len = s.length();
		String rev = "";
		for(int i=len-1; i>=0; i--) {
		rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
        System.out.println(len); 
	}

}
