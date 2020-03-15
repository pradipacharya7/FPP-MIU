package practice;

public abstract class Account {
	private int accountNum;
	protected double balance;
	Employee emp;
	public Account(Employee emp,int accountNum,double initialBalance ) {
		this.accountNum=accountNum;
		this.emp=emp;
		this.balance=initialBalance;
	}
	public abstract double getBalance();

}
