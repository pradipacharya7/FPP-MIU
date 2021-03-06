package com.assignment5_3;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		double total =sumOfAllBalances();
		System.out.println("Total balance is "+total);
		String sel;
		do {
		System.out.println("Make a selection \nA.See Report of all accounts\nB.Make a deposit.\nC.Make a withdrawal\nD.Exit");
		sel=sc.next();
		
		switch(sel)
		{
		case "a":case"A":
			String info = getFormattedAccountInfo();
			System.out.println(info);
			break;
			
		
		
	
		case "b":case "B":
			System.out.println("Make deposit of \n0.Jim Daley\n1.Bob Reuben.\n2.Susan Randolph");
			int nameSel=sc.nextInt();
			
			switch(nameSel)
			{
			case 0:
				System.out.println("Make a selection \n0.Savings\n1.Checking.\n2.Retirement");
				int accSel=sc.nextInt();
				
				switch(accSel)
				{
				case 0:
					double amtS=askAmount();
					emps[0].deposit(AccountType.SAVINGS,amtS);
			
					break;
					
					
				case 1:
					double amtC=askAmount();
					emps[0].deposit(AccountType.CHECKING,amtC);
					break;
				case 2:
					double amtR=askAmount();
					emps[0].deposit(AccountType.SAVINGS,amtR);
					break;
				}
				break;
			case 1:
				System.out.println("Make a selection \n0.Savings\n1.Checking.\n2.Retirement");
				int accSelB=sc.nextInt();
				
				switch(accSelB)
				{
				case 0:
					double amtS=askAmount();
					emps[1].deposit(AccountType.SAVINGS,amtS);
			
					break;
					
					
				case 1:
					double amtC=askAmount();
					emps[1].deposit(AccountType.CHECKING,amtC);
					break;
				case 2:
					double amtR=askAmount();
					emps[1].deposit(AccountType.SAVINGS,amtR);
					break;
				}
				break;
				
			case 2:
				System.out.println("Make a selection \n0.Savings\n1.Checking.\n2.Retirement");
				int accSelS=sc.nextInt();
				
				switch(accSelS)
				{
				case 0:
					double amtS=askAmount();
					emps[2].deposit(AccountType.SAVINGS,amtS);
			
					break;
					
					
				case 1:
					double amtC=askAmount();
					emps[2].deposit(AccountType.CHECKING,amtC);
					break;
				case 2:
					double amtR=askAmount();
					emps[2].deposit(AccountType.SAVINGS,amtR);
					break;
				}
				break;
			}
			break;
		case "c":case "C":
			System.out.println("Make deposit of \n0.Jim Daley\n1.Bob Reuben.\n2.Susan Randolph");
			int nameSelW=sc.nextInt();
			
			switch(nameSelW)
			{
			case 0:
				System.out.println("Make a selection \n0.Savings\n1.Checking.\n2.Retirement");
				int accSel=sc.nextInt();
				
				switch(accSel)
				{
				case 0:
					double amtS=askAmount();
					emps[0].withdraw(AccountType.SAVINGS,amtS);
			
					break;
					
					
				case 1:
					double amtC=askAmount();
					emps[0].withdraw(AccountType.CHECKING,amtC);
					break;
				case 2:
					double amtR=askAmount();
					emps[0].withdraw(AccountType.SAVINGS,amtR);
					break;
				}
				break;
			case 1:
				System.out.println("Make a selection \n0.Savings\n1.Checking.\n2.Retirement");
				int accSelB=sc.nextInt();
				
				switch(accSelB)
				{
				case 0:
					double amtS=askAmount();
					emps[1].withdraw(AccountType.SAVINGS,amtS);
			
					break;
					
					
				case 1:
					double amtC=askAmount();
					emps[1].withdraw(AccountType.CHECKING,amtC);
					break;
				case 2:
					double amtR=askAmount();
					emps[1].withdraw(AccountType.SAVINGS,amtR);
					break;
				}
				break;
				
			case 2:
				System.out.println("Make a selection \n0.Savings\n1.Checking.\n2.Retirement");
				int accSelS=sc.nextInt();
				
				switch(accSelS)
				{
				case 0:
					double amtS=askAmount();
					emps[2].withdraw(AccountType.SAVINGS,amtS);
			
					break;
					
					
				case 1:
					double amtC=askAmount();
					emps[2].withdraw(AccountType.CHECKING,amtC);
					break;
				case 2:
					double amtR=askAmount();
					emps[2].withdraw(AccountType.SAVINGS,amtR);
					break;
				}
				break;
			}
			break;
		}
		}while(sel!="D");
	
		
	}
		
		
		
//		boolean withDrawl=emps[0].withdraw(AccountType.CHECKING,1585155);
//		if(withDrawl==false) System.out.println("Sorry you dont have sufficient balance");

//		for phase I � console outputY
		
//		System.out.print("See a report of all account balances? (y/n) ");
//		String answer = sc.next();
//		if(answer.equalsIgnoreCase("y")){
//			String info = getFormattedAccountInfo();
//			System.out.println(info);
//			//display info to console
//		}
//		else {
//			//do nothing..the application ends here
//		}		
		
		
	
		String getFormattedAccountInfo() {
		StringBuilder str = new StringBuilder("");
		 for (Employee employee : emps) 
		 {
			 
			
			 str.append(employee.getFormattedAcctInfo());
			 str.append("\n");
			 			
		}
		return str.toString();
		}
		double askAmount()
		{
			System.out.println("Enter the amount you want to deposit");
		double	amountTodeposit=sc.nextDouble();
			return amountTodeposit;
		}
		
		
		double sumOfAllBalances()
		{
			double sumOfAllBalance=0;
			for(Employee e: emps)
			{
			var accounts=e.getAccounts();	
			
			for(Account a: accounts) 
			{
				sumOfAllBalance+= a.getBalance();
			}
			}
			return sumOfAllBalance;
			
		
		}
}
	

