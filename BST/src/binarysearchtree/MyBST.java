package binarysearchtree;
public class MyBST {
	   /** The tree root. */
	   private BinaryNode root;

		public MyBST() {
			root = null;
		}
		/**
		 * Prints the values in the nodes of the tree
		 * in sorted order.
		 */
	    public void printTree() {
	        if( root == null )
	            System.out.println( "Empty tree" );
	        else
	        {
	        	
	            printTree( root );
	    		System.out.println("\n");

	        }
	    }
	    
	  //inorder 
	    private void printTree( BinaryNode t ){ 
	        if( t != null ){
	            printTree( t.left );
	            System.out.println( t.element );
	            printTree( t.right );
	        } // An INORDER Traversal
	    }
	    public void preorder() { 
	        if( root == null )
	            System.out.println( "Empty tree" );
	        else
	        {
	            preorder( root );
	        }
	    }
	    public void preorder(BinaryNode root)
	    {
	    	if(root!=null) 
	    	{
	    		System.out.println(root.element);
	    		preorder(root.left);
	    		preorder(root.right);
	    		
	    	}
	    	
	    }
	    public void postorder() {
	        if( root == null )
	            System.out.println( "Empty tree" );
	        else
	        {
	        	postorder( root );
	        }
	    }
	    public void postorder(BinaryNode root)
	    {
	    	if(root!=null)
	    	{
	    		
	    		postorder(root.left);
	    		postorder(root.right);
	    		System.out.println(root.element);
	    	}
	    }
	    public void countNodes() {
	        if( root == null )
	            System.out.println( "Empty tree" );
	        else
	        {
	        	int countNOdes=countNodes( root );
	        	System.out.println("Number of nodes are:"+countNOdes);
	        }
	    }
	    public int countNodes(BinaryNode root)
		 {
			 if(root==null) return 0;
			 if((root.left==null)&&(root.right==null)) return 1;
			return(1+countNodes(root.left)+countNodes(root.right));
				 
		 }
	    public void countLeaves() {
	        if( root == null )
	            System.out.println( "Empty tree" );
	        else
	        {
	        	int countLeaves=countLeaves( root );
	        	System.out.println("Number of nodes are:"+countLeaves);

	        }
	    }
	    public int countLeaves(BinaryNode root)
		 {
			 if(root==null) return 0;
			 if((root.left==null)&&(root.right==null)) return 1;
			return(countLeaves(root.left)+countLeaves(root.right));
				 
		 }
		 
	 
	//Assume the data in the Node is an Integer.	

	 public void insert(Integer x) {
			if (root == null) {
				root = new BinaryNode(x, null, null);
	return;
			}
			
	 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted){
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
						n.right = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.right;
					}
				}
			}
			return;

		}
	 

	   private class BinaryNode {
	    	
//	         Constructors
	    	BinaryNode( Integer theElement ){
	        	this( theElement, null, null );
	    	}	

	    	BinaryNode( Integer element, 
	 BinaryNode left, 
	 BinaryNode right ){
	        	this.element = element;
	        	this.left = left;
	        	this.right = right;
	    	}
	    	private Integer element;// The data in the node
	    	private BinaryNode left;      // Left child
	    	private BinaryNode right;     // Right child
		}
	   
	}

