package com.assignment5_3;


public class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	protected double balance;
	//private String acctType;
	private Employee employee;

	Account(Employee emp, double balance){
	employee = emp;
//	this.acctType =acctType;
	this.balance = balance;
	}

	Account(Employee emp){
	this(emp,DEFAULT_BALANCE);
	}
	public String toString() {
	return "type ="+getAccountType()+", balance = $"+balance+"\t";
	}
	public void makeDeposit(double deposit) {
	balance+=deposit;
	balance-=5;
	}
	public boolean makeWithdrawal(double amount) {
		if(balance>amount)
		{
		balance-=amount;
		return true;
		}
	return false;
	}
	
	public String getAccountType() {
	 return null;
	}
	public double getBalance() {
	
		return balance;
	}
	public double computeInterest()
	{
	return 0;
	}

}
