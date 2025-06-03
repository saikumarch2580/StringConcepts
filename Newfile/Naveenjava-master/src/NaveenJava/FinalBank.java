package NaveenJava;

public class FinalBank {

	public static void main(String[] args) {
		HDFCBank hd = new HDFCBank();
		hd.HdfcBank();
		hd.IciciBank();
		hd.regonalBank();
		hd.SBIBank();

		Bank b = new HDFCBank();
		b.HdfcBank();
		b.SBIBank();
		
	}
    
	
}
