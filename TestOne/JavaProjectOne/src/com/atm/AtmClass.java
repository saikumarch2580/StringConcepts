package com.atm;

public class AtmClass implements AtmFunctionalities {

	AtmImpl atm = new AtmImpl() ;
	

	
	@Override
	public void Withdraw(double withdraw) {
	
		if( atm.getAvailbleBalance()>withdraw) {
		double actualwithdrawAmount= atm.getAvailbleBalance()-withdraw;
		System.out.println(actualwithdrawAmount);
		atm.setAvailbleBalance(actualwithdrawAmount);
		} else {
			
			System.out.println("You dont have suffecient balance");
		}
		
		
		
		
	}

	@Override
	public void deposite(double deposite) {
		
		
		double actualdeposit = atm.getAvailbleBalance()+deposite;
		System.out.println("The actualdeposite amount is : "+ actualdeposit);
		atm.setAvailbleBalance(actualdeposit);
		
		
	}


	@Override
	public void viewBalance() {
	
		
		atm.getAvailbleBalance();
		System.out.println("The available balance is : "+ atm.getAvailbleBalance());

		
		
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		
	}

	

}
