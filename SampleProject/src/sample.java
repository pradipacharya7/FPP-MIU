import java.util.Scanner;
public class sample {
	
//	public int a,b;
	
//	static void getter(int a, int b)
//	{
//		int x=a;
//		int y=b;
//	}

	public static void main(String[] args)
	{
//		System.out.println("Hello World");
		
		Scanner S = new Scanner(System.in);
		
//		System.out.println("Enter your name");
//		
//		String name=S.nextLine();
//		System.out.println("Your name is "+name);
		int age;
		System.out.println("enter your age");
		age=S.nextInt();
		System.out.println("\n Your age is "+age);
		
		person p = new person();
		
		p.get_age(age);
		p.set_age();
		
		
	}
}
