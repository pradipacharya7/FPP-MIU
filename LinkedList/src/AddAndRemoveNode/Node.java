package AddAndRemoveNode;

public class Node {
	String data;
	Node next;
	Node previous;
	 Node(Node previous,Node next, String data)
	{
		this.previous=previous;
		this.next=next;
		this.data=data;
	}
	Node(String data)
	{
		
		this.previous=null;
		this.next=null;
		this.data=data;
	}
}
