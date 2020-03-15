package AddAndRemoveNode;



public class MainLinkedList {
	
	static Node header=new Node(null,null,null);
	public static void main(String[] args)
	{
		addAtFirst("Guragain");
		addAtFirst("hari");
		addAtFirst("ram");
		addAtFirst("gita");
		addAtLast("Rama");
		
		display();
		removeFirst();
		System.out.println("\n");
		display();
		removeLast();
		System.out.println("\n");
		display();
		addAtFirst("Pradip");
		System.out.println("\n");

		display();
		addAtLast("Acharya");
		System.out.println("\n");

		display();
	}
	private static void display() {
		Node temp=header.next;
		while(temp!=null)
		{
			System.out.printf("%s%s",temp.data,"->");
			temp=temp.next;
			
			
		}		
	}
	private static void addAtFirst(String string) {
		
		Node new_node=new Node(string);
		new_node.next=header.next;
		new_node.previous=header;
		header.next=new_node;
		
		
	}
	public static void addAtLast(String string) 
	{
		Node new_node=new Node(string);
		Node temp=header;
		for(int i=0;i<getSize()-1;i++)
		{
			temp=temp.next;
		}
	
		new_node.previous=temp;
		temp.next=new_node;
		
		
	}
	public static void removeFirst()
	{
		Node temp=header.next;
		header.next=temp.next;
		temp.next.previous=header;
		return;
		
	}
	
	public static void removeLast()
	{
		Node temp=header.next;
		for(int i=0;i<getSize()-2;i++)
		{
			temp=temp.next;
		}
		
		
		temp.previous.next=null;
		
	}
	
	public  static int getSize()
	{
		Node temp=header.next;
		int count=1;
		while(temp!=null)
		{
			
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	

}
