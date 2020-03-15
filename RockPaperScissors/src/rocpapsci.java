import java.util.Random;
import java.util.Scanner;


public class rocpapsci 
{
	static Random randomGenerator = new Random();
	
	 public static int getRandomNumber() 
	    {
	        return randomGenerator.nextInt(3);

	    }

	  public static int users_choice()
	  {
	  		System.out.println("  \t\t***Enter your Choice***\n1.Rock \n2.Papper \n3.Scissors");

	  			Scanner input = new Scanner(System.in);
				int number = input.nextInt();

				switch(number)
				{
					case 1:
					return 1;
					

					case 2:
					return 2;
					


					case 3:
					return 3;
				

					default:
					System.out.println("Re-enter the value");


				}
				return 0;
	  }

	  public static int winner(int a, int b)
	  {
	 

	  	if(a==b) 
	  	return(0);
	  	else if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)) return(1);
	  	else return(2);

	  }
	

	 public static void main(String[] args) 
	 {
		
		int comp_choice=getRandomNumber();	 
		 int user_choice=users_choice();

		int  w=winner(comp_choice, user_choice);

		if(w==0) System.out.println("\n \t Draw ");
		if(w==1) System.out.println("\n \tComputer won. Better Luck Next Time ");
		if(w==2) System.out.println("\n \tYou won. \n \t******CONGRATULATIONS*****");

}
}
