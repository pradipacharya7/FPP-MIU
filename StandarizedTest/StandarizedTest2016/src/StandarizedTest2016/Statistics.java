package StandarizedTest2016;

import java.util.List;

public class Statistics{
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> combined) {
//		return 0.0;
		double totalSum=0;
		for(EmployeeData ed:combined)
		{
			totalSum+=ed.getSalary();
			
		}
		return totalSum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
