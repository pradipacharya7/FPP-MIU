package prob2.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum=0;
		for(Employee emp:emps)
		{
			List<Account> accounts=emp.getAccounts();
			for(Account a: accounts)
			{
			
			sum+=a.getBalance();
		}
		
		
	}
		return sum;
}
}
