package accessmodifiers;

public class Private2 {

	public static void main(String[] args) {
		Private1 ab = new Private1();
	int	r= ab.getfinalnumber();
	System.out.println(r);
	  ab.modifier(12);
	   int s = ab.getfinalnumber();
		 
	   System.out.println(s);
	}
	
}
