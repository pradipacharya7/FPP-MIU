package queueAssignmnet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UserInput {
	static Scanner sc=new Scanner(System.in);
	static Deque<Character> queue=new ArrayDeque<Character>();	
	public static void checkLine() 
	{
		System.out.println("Enter any line");
		String line=sc.next();
		char c;
		for(int i=0;i<line.length();i++)
		{
		 c=line.charAt(i);
		 queue.add(c);
		}
		String s1="";
		String s2="";
		int size=queue.size();
		int count=size;
			boolean cont=true;
		
			while(cont)
			{
				if(count<1) break;
				if(queue.peek()==':') 
				{
					queue.remove();
					while(count>1)
					{
						s2+=queue.remove();
						count--;
					}
					cont=false;
					
				}
				if(cont==false) break;
				
				s1+=queue.remove();
				count--;
			}
		if(s1.equals(s2)) System.out.println("S:Left and right string are same.");
		if(s1.length()>s2.length()) System.out.println("L:Left string is greater than right string.");
		if(s1.length()<s2.length()) System.out.println("R:Rightstring is greater than left string.");
		if(s1.length()==s2.length()) System.out.println("E:Left string is equal in size with right string.");
		if(s2.length()==0) System.out.println("N:No colon");
		return;
		
		
	}
	public static void main(String[] args) throws Exception
	{
		checkLine();
	}

}
