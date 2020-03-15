package practice;

public class Checking extends Account{

	public Checking(Employee emp, int accountNum, double initialBalance) {
		super(emp, accountNum, initialBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.balance;
	}
	String getacctType()
	{
		return "CHECKING";
	}

}
