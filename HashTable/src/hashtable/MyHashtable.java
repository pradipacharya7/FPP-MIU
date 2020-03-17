package hashtable;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashtable {
	private static final int INITIAL_SIZE;
	static {
		INITIAL_SIZE=19;
	}
	private int tableSize;
	private LinkedList[] table; 
	public MyHashtable(){
		this(INITIAL_SIZE);
	}
	public MyHashtable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
	}      // an array of LinkedList objects.
	

 

	public void put(Object key, Object value){
		//disallow null keys
		if(key==null) return;

		//get the "big" integer corresponding to the object
		//assumes key is not null
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		
		//put the value and the key into an Entry object
		//which will be placed in the table in the
		//slot ( namely, hash)



		//allows a null value
		Entry e = new Entry(key,value);
		
		// now place it in the table
		if(table[hash] == null){
			table[hash] = new LinkedList();
		}
		//this allows duplicate keys
		table[hash].add(e);
	}
 
	public Object get(Object key){
		//null key not allowed
		if(key==null) return null;
		//get the "big" integer corresponding to the object
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		
		//now look for the desired Entry
		Entry e = null;


    //First we should make sure that table[hash]
    //is Not null.  If it is null, then the 
    //Entry is Not there.      (JL 11-2009).

		Iterator it = table[hash].iterator();
		while(it.hasNext()){
			e = (Entry)it.next();
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null; // Not found. 
		 
	}
	public int countElements()
	{
		int count=0;
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the
                           //LinkedList at table[i]

				
				while(it.hasNext()){
					it.next();
					count++;
					
				}
			}
		}
		return count;
		
	
		
	}
	public int emptyArraycells()
	{
		int count=0;
		for(int i=0;i<table.length;i++)
		{
			if(table[i]==null)
			{
				
			count++;	
			}
		}
		
		return count;
	}

	
	public boolean checkforDuplicate(String key) {
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				Iterator it = table[i].iterator();
				if (it.hasNext()) {
					Entry e = (Entry) it.next();
					if (e.getKey().equals(key)) {
						System.out.println(key +"   Duplicate Occur \n");
						
					}
				}
			}
		}

		return false;
	}
	

 
public String toString(){
		String n = System.getProperty("line.separator");//a new line
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator it = table[i].iterator();//For the
                           //LinkedList at table[i]

				Entry next = null;
				while(it.hasNext()){
					next = (Entry)it.next();
					sb.append(next);
				}
			}
		}
		return sb.toString();
	}


//In the java file this method might be called hash
	private int hashM(int bigNum) {
		return bigNum % tableSize;
	}
	
 
private class Entry{
		private Object key;
		private Object value;
		Entry(Object key, Object value){
			this.key = key;
			this.value = value;
		}
		public String getKey() {
			return key.toString();
		}

		public String toString(){
			return key.toString()+"->"+value.toString();
		}
		
	}
}
