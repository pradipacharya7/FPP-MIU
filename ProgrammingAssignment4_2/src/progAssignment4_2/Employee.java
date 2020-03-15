package progAssignment4_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	
	public String getName() {
		return name;
	}
	public Employee(String name, int yearOfHire, 
int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = 
new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		checkingAcct=new Account(this,"checking",startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		savingsAcct=new Account(this,"savings",startAmount);		
	}
	public void createNewRetirement(double startAmount) {
		retirementAcct=new Account(this,"retirement",startAmount);
	}

	public void deposit(AccountType acctType, double amt){
		switch (acctType) 
		{
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			
			break;
		
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);			
			break;
		default:
			System.out.println("the type that your enter is not define on our database");
			break;
		}
		 
	}
	public boolean withdraw(AccountType acctType, double amt)
	{
		switch (acctType) 
		{
		case CHECKING:
			return(checkingAcct.makeWithdrawal(amt));
			
		
		
		case RETIREMENT:
			return(retirementAcct.makeWithdrawal(amt));
			
			
		case SAVINGS:
			return(savingsAcct.makeWithdrawal(amt));			
		
		default:
			System.out.println("the type that your enter is not define on our database");
			break;
		}
		return false;
	}

	public String getFormattedAcctInfo() {
		
		String template  = "ACCOUNT INFO FOR %s\n\n%s%s%s";		
		return String.format(template,this.getName(), (this.checkingAcct==null?"":this.checkingAcct),(this.savingsAcct==null?"":this.savingsAcct) ,(this.retirementAcct==null?"":this.retirementAcct) );
		
	}


}
