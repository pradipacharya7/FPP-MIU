package prob1;


public class ArrayQueueImpl {

	private int[] arr = new int[5];
	private int front = -1;
	private int rear = 0;
	
	
	public int peek() throws QueueException
	{
		if(!isEmpty())
			
			return arr[front];
		
		return -1;
		//implement
	}
	
	public void enqueue(int obj) {
		if(rear==arr.length) size();
		if(front==-1) front++;
		arr[rear]=obj;
		rear++;
	}
	
	public int dequeue() throws QueueException{
		if(!isEmpty())
		{
			front++;
			return front-1;
		}
		return -1;
		//implement
	}
	
	public boolean isEmpty(){	
		if(front==-1 && rear==0)
			return true;
		return false;
	}
	
	public int size(){	
		int size=arr.length;
		int [] temp=new int [size+1];
		for(int i=0;i<size;i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;
		return arr.length;
	}
	
} 