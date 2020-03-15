package linkedlistAssignment;

import java.util.*;


public class UsingLinkedLsit {
	static final Scanner sc = new Scanner(System.in);
	static LinkedList<Character> A = new LinkedList<Character>();
	static LinkedList<Character> B = new LinkedList<Character>();
	static LinkedList<Character> C = new LinkedList<Character>();

	public static void main(String[] args) {
		String c;

		do {
			System.out.println("Enter Your choice \n1.R for read\n2.C for concatinate \n3.W to write\n4.Q for quit \n5.CL \n6.L\n6.E");
			c = sc.nextLine();

			switch (c.toUpperCase()) {
			case "R":

				System.out.println("Choose your list \nA or B or C");
				String l = sc.nextLine();
				List<Character> list = getList(l);
				System.out.println("Enter the text");
				String text = sc.nextLine();
				populate(list, text);
				break;

			case "C":
				System.out.println("Enter target");
				String target = sc.nextLine();
				System.out.println("Enter string name");
				String string = sc.nextLine();
				List<Character> getTarget = getList(target);
				List<Character> getString = getList(string);
				getTarget.addAll(getString);
				break;

			case "W":
				System.out.println("Enter the list you want to write");
				String listName = sc.nextLine();
				List<Character> getStringToPrint = getList(listName);
				for (Character ch : getStringToPrint) {
					System.out.printf("%s", ch);
				}
				break;
			case "CL":
				System.out.println("Enter the List name(A / B / C)");
				String CL=sc.nextLine();
				LinkedList<Character> cl=getList(CL);
				cl.clear();
				
				break;
			case "L":
				System.out.println("Enter the List name(A / B / C)");
				String forLen=sc.nextLine();
				LinkedList<Character> varList=getList(forLen);
				int len= getSize(varList);
				System.out.println("Length is :"+len);
				break;
			case "E":
				System.out.println("Enter the first List name(A / B / C)");
				String firstList=sc.nextLine();
				System.out.println("Enter the second List name(A / B / C)");
				String secondList=sc.nextLine();
				LinkedList<Character>fList=getList(firstList);
				LinkedList<Character>sList=getList(secondList);
				boolean equal=checkEqual(fList,sList);
				if(equal==true) System.out.println("Two Linklist are equal");
				else System.out.println("Two Linklist are not equal");
				break;
				
			default:
				System.out.println("You enter wrong choice");
				break;

			}
		} while (!c.equals("q") ||! c.equals("Q"));
	}

	private static boolean checkEqual(LinkedList<Character> fList, LinkedList<Character> sList) {
		if(fList.size()!=sList.size())
			return false;
		Iterator<Character> i1=fList.iterator();
		Iterator<Character> i2=sList.iterator();
		
		while(i1.hasNext()&&i2.hasNext())
		{
			if(!i1.next().equals(i2.next()))
			return false;
			
		}
		return true;
	}

	private static int getSize(LinkedList<Character> varList) {
		Iterator<Character> i= varList.iterator();
		int count=0;
		while(i.hasNext())
		{
		i.next();
		count ++;
		}
		return count;
	}

	private static void populate(List<Character> list, String text) {
		A.add(' ');
		for (int i = 0; i < text.length(); i++) {
			list.add(text.charAt(i));
		}

	}

	private static LinkedList<Character> getList(String target) {
		switch (target.toUpperCase()) {
		case "A":
			return A;
		case "B":
			return B;
		case "C":
			return C;
		}
		return null;
	}

}
