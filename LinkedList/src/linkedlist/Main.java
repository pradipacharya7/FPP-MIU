package linkedlist;

//import java.util.Scanner;

public class Main {
				protected static Node head=new Node(null,null,null);
//			protected static Node head=null;

				public static void  add_Node (int n, String data) //INSERT NODE AT ANY POSITION
				{
					Node new_node=new Node(data);
					
					if(n==1)
					{
//						new_node.next=head;
						
						new_node.previous=head;
						new_node.next=head.next;
						head.next=new_node;
						return;
						
					}
					
				Node temp=head;
				for(int i=0;i<n-1;i++)
				{
					temp=temp.next;
					
				}
				new_node.next=temp.next;
				temp.next=new_node;
				new_node.previous=temp;
					
				}
				
				public static void display()  //Display all of LINKED LIST
				{
					Node temp=head.next;
					while(temp!=null)
					{
						System.out.printf("%s%s",temp.data,"->");
						temp=temp.next;
						
						
					}
				}
				public static void deleteNode(int n)
				{
					if(n==1)
					{
					
						head.next=head.next.next;
						head.next.previous=head;
						
						return;
					}
					Node temp=head;
					for(int i=0;i<n-1;i++)
					{
						temp=temp.next;
						
					}
					Node temp2=temp.next;
					temp.next=temp2.next;
					temp2.next.previous=temp2.previous;
					
					return;
				}
				public static int sizeOfLinkedList() //getting total no of nodes
				{
					int size=0;
					Node temp=head.next;
					while(temp!=null)
					{
						size++;
					temp=temp.next;	
					}
					
					return size;
				}
				public static void search(String target)
				{
					Node temp=head.next;
				
					while(temp!=null)
					{
						if(temp.data.contentEquals(target));
						
					}
				}
				public static void main(String[] args)
				{
//					System.out.println("Enter the data you want to insert");
//					Scanner sc=new Scanner(System.in);
//					String data=sc.nextLine();
//					System.out.println("Enter the position you want to insert");
//					int n=sc.nextInt();
					
					add_Node(1, "hari");
					add_Node(2, "gita");
					add_Node(3, "sita");
					
					add_Node(4, "ram");
					add_Node(1, "pradip");
					add_Node(1, "kkd");
//					
				
					System.out.println("Data are::");
					int size=sizeOfLinkedList();
					System.out.println("Size of linked list is " + size);
					deleteNode(4);
					
					display();
					int sizel=sizeOfLinkedList();
					System.out.println("Size of linked list is " + sizel);
//					sc.close();
				}

	}