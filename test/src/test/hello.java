package test;

import javax.swing.JOptionPane;

import java.util.Random;

public class hello 
{
	
	static Random randomGenerator = new Random();
    static String operators = "+";
    
    public static char getRandomOperator() 
	{
        return operators.charAt(randomGenerator.nextInt(operators.length()));
    }

    public static int getRandomNumber() 
    {
        return randomGenerator.nextInt(10);

    }
    
    public static int createEquation(int num) {
        
        String equation = "";
        String user_input;
        
        
        
        int count = 0;
        int first_int = 0;
        int second_int = 0;
        double percentage=0;
        
        
        for (int i = 0; i < num; i++) {
        	equation = "";
        	first_int = getRandomNumber();
            equation += first_int;
            equation += getRandomOperator();
            second_int = getRandomNumber();
            equation += second_int;
            user_input = JOptionPane.showInputDialog(null, equation+"=?");
            int result = Integer.parseInt( user_input); 
            if(result == (first_int+second_int)) {
            	count++; 
            	percentage= (count/num)*100;
            	
            	JOptionPane.showMessageDialog(null, "correct");
            }else {
            	JOptionPane.showMessageDialog(null, "incorrect");
            }
        }
        String message = null;
        if(percentage>60) message="Excellent";
        if(percentage<=60) message="You need more practice";
        
        JOptionPane.showMessageDialog(null, "You got "+count+" out of "+num+ " questions correct. "
        		+ "which equates to " +percentage+" % " +message);
        
        return 0;
    }
    
	public static void main(String[] args) 
	{
		
		String x;
		x = JOptionPane.showInputDialog(null, "How many equations would you like to solve?");
		
		// convert String inputs to int values for use in a calculation
	      int num = Integer.parseInt( x ); 
	      
	    createEquation(num);
	        
	}
	
	
}
