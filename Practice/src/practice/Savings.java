package practice;

public class Savings extends Account{

	public Savings(Employee emp, int accountNum, double initialBalance) {
		super(emp, accountNum, initialBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBalance() {
		
		return super.balance;
	}
	String getacctType()
	{
		return "SAVINGS";
	}	

}
