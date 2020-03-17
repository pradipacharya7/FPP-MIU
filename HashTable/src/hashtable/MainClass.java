package hashtable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int n;
	String key="";
	double value;
	System.out.println("How many entries?");
	n= sc.nextInt();
	MyHashtable myhash=new MyHashtable(); //object created
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter the key");
	key=sc.next();
	System.out.println("Enter the value");
	value=sc.nextDouble();
	
	myhash.put(key,value); // put method called

	}
	System.out.println("Get ?");
	String get_key=sc.next();
	System.out.println(get_key);
	System.out.println(myhash.toString());
	
	System.out.println("No of elements are: "+myhash.countElements());
	System.out.println("Empty array cells are: "+myhash.emptyArraycells());	
	System.out.println("Check Dublicates?");
	String dup_key=sc.next();
	System.out.println(myhash.checkforDuplicate(dup_key));

	
}
}
