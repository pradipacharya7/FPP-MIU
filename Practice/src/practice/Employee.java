package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Employee {
	private String name;
	private Date hireDay;
	private List<Account> accounts=new ArrayList<Account>();
	Employee(String aName, int day,int month, int year)
	{
		this.name=aName;
		GregorianCalendar date	=new GregorianCalendar(year, month, day);
		hireDay=date.getTime();
				
	}
	
	public void addSavings(int accountNum, double initialBalance)
	{
		accounts.add(new Savings(this,accountNum,initialBalance));
	}
	public void addRetirement(int accountNum, double initialBalance)
	{
		accounts.add(new Retirement(this,accountNum,initialBalance));
	}
	public void addChecking(int accountNum, double initialBalance)
	{
		accounts.add(new Checking(this,accountNum,initialBalance));
	}
	
	public List<Account> getAccount()
	{
		
		return accounts;
		
	}
	

}
