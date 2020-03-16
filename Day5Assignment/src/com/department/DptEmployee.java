package com.department;

import java.util.Date;
import java.util.GregorianCalendar;

public class DptEmployee {

	public String name;
	double salary;
	private Date hireDate;
	
	DptEmployee(String name,double salary,int year, int month, int day)
	{
		this.name=name;
		this.salary=salary;
		GregorianCalendar cal=new GregorianCalendar(year,month,day);
		this.hireDate=cal.getTime();
	}
	public DptEmployee(String name,int year, int month, int day) {
		this.name=name;
		GregorianCalendar cal=new GregorianCalendar(year,month,day);
		this.hireDate=cal.getTime();
		
	}
	public String getName() {
		return this.name;
	}
	
	public double computeSalary()
	{
		return this.salary;
	}
	public double getSalary() 
	{
		return this.salary;
	}
	
}