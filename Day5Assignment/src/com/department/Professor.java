package com.department;

public class Professor extends DptEmployee {
	private int numberOfPublication;
	public Professor(String name, double salary, int year,int month, int day) 
	{
		super(name,salary,year,month,day);
	}
	
	
	public void setNumberOfPublications(int numberOfPublication) {
		this.numberOfPublication=numberOfPublication;
	}
	public int getNumberOfPublications() {
		return this.numberOfPublication;
	}

}
