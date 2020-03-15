package linkedlist;

public class Node {
		Node next;
		Node previous;
		String data;
		Node(Node next,Node previous,String data)
		{
			this.data=data;
			this.next=this.previous=null;
		}
		Node(String data)
		{
			this.data=data;
			this.next=null;
			this.previous=null;
			
		}

}
