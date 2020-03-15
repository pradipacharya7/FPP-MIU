package com.assignment5_3;

public class CheckingAccount extends Account{
CheckingAccount(Employee emp,double startAmount) {
		super(emp,startAmount);
		
	}

public String getAccountType() {
	return "CHECKING";
}
public double getBalance() {
	balance-=5;
	return balance;
}
public double computeInterest() {
	double interest=balance*.02;
	return interest;
}
}
