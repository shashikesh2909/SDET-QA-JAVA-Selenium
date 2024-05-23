package Day6;

public class ObjectArray
{
	public static void main(String[] args)
	{
		// Object is a key word use to store any datatype date. Array can store different type of data    /// IMP: Need to use capital o in Object to use it.
		
		Object a[] ={"hello",100,0.5,'a',true};
		
		for(Object x :a)
		{
			System.out.println(x);
		}	
	}
}
