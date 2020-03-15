package com.assignment5_3;

public class SavingsAccount extends Account{
	SavingsAccount(Employee emp,double startAmount) {
		super(emp,startAmount);
		// TODO Auto-generated constructor stub
	}

	public String getAccountType() {
		return "SAVINGS";
	}
	public double getBalance() {
		balance+=.0025*balance;
		return balance;
	}
	public double computeInterest()
	{
		double interest=balance*.04;
		return interest;
	}
}

