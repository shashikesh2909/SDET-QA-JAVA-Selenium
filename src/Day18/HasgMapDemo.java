package Day18;

import java.util.HashMap;
import java.util.Map;

public class HasgMapDemo {

	public static void main(String[] args) 
	{
		//------------- Declaration of Hashmap --------
		
	//	METHOD 1 :  When the data type of the key and value is not specific
	//	HashMap hm = new HashMap();

	//	METHOD 1 :  When the data type of the key and value is specific
		HashMap <Integer,String> hm1 = new HashMap<Integer,String>();
		
		
		//------------- Adding pairs into HashMap --------
			hm1.put(106,"John");
			hm1.put(105,"Scott");
			hm1.put(101,"David");
			hm1.put(103,"Smith");
			hm1.put(102,"Kim");
			hm1.put(106,"JOhn Snow");
			
			System.out.println(hm1);
			System.out.println(hm1.size());
			
		
		//------------- Search in HashMap --------	
			
			if(hm1.containsKey(200) )
			{
				System.out.println("key is present");
			}
			else
			{
				System.out.println("key is not present");
			}
			
		//------------- Remove pair from HashMap --------
			
			hm1.remove(103);
			System.out.println("After removing: "+hm1);
			
			
		//------------- Read data from HashMap using for loop--------
			
			System.out.println(hm1.get(106));     // .get() to fetch the    value for a key
		
			for(Map.Entry m : hm1.entrySet())
			{
				System.out.println(m.getKey()+ " " +m.getValue());
			}
	}

}
