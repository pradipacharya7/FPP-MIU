import java.util.Scanner;

public class Factorial {
	//method to calculate factorial
	public static int factorial(int n)
	{
		if(n==1||n==0)
			
		return 1;
		else return n*factorial(n-1);
	}
	
	//method to calculate power 
	public static double power(double x, int n)
	{
		if(n==1)
			return x;
		
		else return (x*power(x,n-1));
		
	}
public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	int fact= factorial(n);
	System.out.printf("Factorial od %d is ",fact);
	double val=power(25,2);
	System.out.printf("\n%d to the power %.2f is %.2f",2,5.00,val);
	
	sc.close();
}

}
