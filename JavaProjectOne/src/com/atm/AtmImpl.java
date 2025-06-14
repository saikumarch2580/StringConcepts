package com.atm;

public class AtmImpl {
	
	private double Withdraw;
	private double deposite;
    private double AvailbleBalance;
    
    
	public double getWithdraw() {
		return Withdraw;
	}
	public void setWithdraw(double withdraw) {
		Withdraw = withdraw;
	}
	public double getAvailbleBalance() {
		return AvailbleBalance;
	}
	public void setAvailbleBalance(double availbleBalance) {
		AvailbleBalance = availbleBalance;
	}
	public double getDeposite() {
		return deposite;
	}
	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}

	

}
