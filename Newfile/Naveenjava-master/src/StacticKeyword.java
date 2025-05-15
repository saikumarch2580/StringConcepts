
public class StacticKeyword {

	int abc = 10;
	double b = 15.5;
	static String Colour = "Red";
	static String amount="78";
	public static void main(String[] args) {
		
		//System.out.println(Colour);
		
		StacticKeyword sk = new StacticKeyword();
		System.out.println(sk.abc);
		System.out.println(Colour);
		sk.newstatic();
		
	}
public void newstatic() {
	
	System.out.println(Colour);
    System.out.println(abc);
    System.out.println(amount);
}

public void oldstatic() {
	
	 int a = Integer.parseInt(amount);
	
	System.out.println(a); 
		
	
}
}
