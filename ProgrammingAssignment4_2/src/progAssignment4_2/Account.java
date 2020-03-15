package progAssignment4_2;

public class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance){
	employee = emp;
	this.acctType =acctType;
	this.balance = balance;
	}

	Account(Employee emp, String acctType){
	this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
	return "type = "+acctType+", balance = "+balance;
	}
	public void makeDeposit(double deposit) {
	balance+=deposit;
	}
	public boolean makeWithdrawal(double amount) {
		if(balance>amount)
		{
		balance-=amount;
		return true;
		}
	return false;
	}
	
	public String getAccttype() {
		return this.acctType;
	}
	public double getBalance() {
		return this.balance;
	}
	public double computeInterest() 
	{
		double interest;
		if(acctType=="checking")
		{
			interest=balance*.02;
			return interest;
		}
		else if(acctType=="savings")
		{
			interest=balance*.04;
			return interest;
		}
		else if(acctType=="retirement")
		{
			interest=balance*.05;
			return interest;
		}
		else return 0;
	}


}
