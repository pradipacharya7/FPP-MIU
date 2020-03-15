package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
	{
		Employee[] emps=new Employee[3];
		emps[0]=new Employee("Hari",12 , 1, 2014);
		emps[1]=new Employee("Ram",12 , 1, 2014);
		emps[2]=new Employee("Gita",12 , 1, 2014);
		
		emps[0].addSavings(10000,4454544);
		emps[0].addRetirement(10000,4454544);
		emps[0].addChecking(10000,4454544);
		emps[1].addSavings(10000,4454544);
		emps[1].addRetirement(10000,4454544);
		emps[1].addChecking(10000,4454544);
		emps[2].addSavings(10000,4454544);
		emps[2].addRetirement(10000,4454544);
		emps[2].addChecking(10000,4454544);
		
		List<Employee> emp=new ArrayList<Employee>();
		for(Employee e:emps)
		{
			emp.add(e);
		}
		
		Statistics s=new Statistics();
		double sum=s.getSumSalaries(emp);
		System.out.println("Sum of salaries is"+sum);
		
		
		
		
	}

}
