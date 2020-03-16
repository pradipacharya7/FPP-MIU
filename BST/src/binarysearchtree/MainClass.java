package binarysearchtree;

public class MainClass {
	public static void main(String[] args)
	   {
	   	MyBST b=new MyBST();
	   	
	   	b.insert(20);
	   	b.insert(30);
	   	b.insert(10);
	   	b.insert(50);
	   	b.insert(5);
	   	b.printTree();	   	
	   	System.out.println();

	   	b.preorder();
	   	System.out.println();
	   	b.postorder();
	   	System.out.println();

	   	b.countNodes();
	   	System.out.println();

	   	b.countLeaves();
	
	  } 
	}
