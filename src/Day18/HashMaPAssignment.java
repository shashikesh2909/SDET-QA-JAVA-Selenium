package Day18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaPAssignment {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,3,2,1,5};
		
		HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for (int x : a)
		{
			if (!hm.containsKey(x))
			{
				hm.put(x, 1);
			}
			else if (hm.containsKey(x))
			{
				hm.put(x, hm.get(x)+1);
			}
		}
		
		for ( Map.Entry e : hm.entrySet())
		{
			System.out.print(e.getKey()+ " " + e.getValue()+"\n");
			
		}
		for (int x : hm.keySet())
		{
			if (hm.get(x)==1)
			{
				System.out.println("non duplicate numbers are : "+ x);
			}
		}
			
			
	}

}
