package com.assignment5_3;

public class RetirementAccount extends Account {
	
	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		
	}

	public String getAccountType() {
		return "RETIREMENT";
	}
	public boolean makeWithdrawal(double amount) {
		if(balance>amount)
		{
		balance-=amount;
		return true;
		}
	return false;
	}
	
	public double computeInterest() {
		double interest=balance*.05;
		return interest;
	}
	
}
