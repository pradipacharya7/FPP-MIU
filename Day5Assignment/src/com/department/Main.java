package com.department;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Professor[] p= new Professor[3];
	p[0]=new Professor("Pradip", 10000, 1996, 2, 12);
	p[1]=new Professor("Acharya", 11000, 1956, 2, 22);
	p[2]=new Professor("Sijal", 11000, 1956, 7, 14);
	
	Secretary[] s=new Secretary[2];
	s[0]=new Secretary("Ram", 14458, 1999, 11, 5);
	s[1]=new Secretary("Gita", 5656546, 1999, 11, 5);
	
	p[0].setNumberOfPublications(10);
	System.out.println("No of publications are:"+p[0].getNumberOfPublications());
	
	s[0].setOvertimeHours(200);
	System.out.println("Salary is "+s[0].computeSalary());
	
	Administrator a=new Administrator("Shayam", 1985, 7, 8);
	a.sethoursWorked(12);
	a.computeSalary();
	
	DptEmployee[] d=new DptEmployee[6];
	d[0]=p[0];
	d[1]=p[1];
	d[2]=p[2];
	d[3]=s[0];
	d[4]=s[1];
	d[5]=a;
	

Scanner sc=new Scanner(System.in);

System.out.print("See a report of all account balances? (y/n) ");
String answer = sc.next();
double sum=0;
if(answer.equalsIgnoreCase("y"))
{
	for(DptEmployee department:d)
	{
		sum+=department.salary;
	}
	System.out.println("Total salary in the Department is "+sum);
}

System.out.print("See a report of a Employee? (y/n) ");
String ans = sc.next();
if(ans.equalsIgnoreCase("y"))
{
System.out.println("Enter the name ");


String ename=sc.next();
for(DptEmployee dpt:d)
{
	if(ename.equals(dpt.getName()))
	{
		System.out.println("Name:"+dpt.getName()+"\nSalary:" +dpt.getSalary());
	}
}

	
	
}


}

}




	


