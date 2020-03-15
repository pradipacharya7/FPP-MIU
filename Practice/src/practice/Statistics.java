package practice;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
	
	public double getSumSalaries(List<Employee> employees)
	{
		List<Account> a=new ArrayList<Account>();
		for(Employee e:employees) {
		a=	e.getAccount();
		}
		double sum=0;
for(Account acc:a)
{
	sum+=acc.getBalance();
}
		return sum;
	}

	

}
