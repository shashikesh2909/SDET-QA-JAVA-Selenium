package Day12;

public class Adder 
{
	int a =10, b=20;
	////////////////////////////////this is called over loading, multiple method with same name.
	// No parameters
	void sum()
	{
		System.out.println(a+b);
	}
	
	// two parameters
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
	// two parameters but different data type
	void sum (int x , double y )
	{
		System.out.println(x+y);
	}
	
	void sum (double x , int y )
	{
		System.out.println(x+y);
	}
	
	// two 
	void sum (int x,int y, int z)
	{
		System.out.println(a+y+z);
	}
	
}
