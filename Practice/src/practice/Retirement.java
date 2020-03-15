package practice;

public class Retirement extends Account {

	public Retirement(Employee emp, int accountNum, double initialBalance) {
		super(emp, accountNum, initialBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	String getacctType()
	{
		return "RETIREMENTS";
	}
}
