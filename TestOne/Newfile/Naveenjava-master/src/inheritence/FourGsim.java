package inheritence;

public class FourGsim extends ThreeGsim {
	
	
	public void manage() {
		
	super.gprs();	 
	}
	public void camera() {
		System.out.println("Camera feature available");
		
	}

	public void gprs() {
		
		
		System.out.println("this is not super class");
	}
	
}
