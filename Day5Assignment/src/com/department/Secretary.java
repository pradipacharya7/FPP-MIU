package com.department;

public class Secretary extends DptEmployee {
	private int overtimeHours;
	public Secretary(String name,double salary,int year, int month, int day)
	{
		super(name,salary,year,month,day);
	}
	public void setOvertimeHours(int overtimeHours)
	{
		this.overtimeHours=overtimeHours;
	}
	public double computeSalary()
	{
	double extraPaid=12*overtimeHours;
	salary+=extraPaid;
	return(salary);
	}
	
	
	
	

}
