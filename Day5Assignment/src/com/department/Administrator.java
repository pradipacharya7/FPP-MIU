package com.department;

public class Administrator extends DptEmployee {
	private int hoursWorked;

	public Administrator(String name, int year, int month, int day) {
		super(name,year, month, day);
		
	}
	
	 void sethoursWorked(int hoursWorked )
	{
		this.hoursWorked=hoursWorked;
	}
	
	public double computeSalary()
	{
	salary= hoursWorked*20;
	return salary;
	}


}
