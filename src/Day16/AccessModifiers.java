package Day16;

import Day15.Classindifferentpackage;

/*
class A 
{
	private int a = 10;
	
	private void m1()
	{
		System.out.println(a);
	}
}



class A 
{
	int a = 10;
	
	void m1()
	{
		System.out.println(a);
	}
}

*/
public class AccessModifiers extends Classindifferentpackage {

	public static void main(String[] args) 
	{
		AccessModifiers  obj = new AccessModifiers ();           
		obj.a = 10;					  // the varibales and method of class A is not accesible here as the varibale and method is private
		obj.m1();        			// the varibales and method of class A is not accesible here as the varibale and method is private           
	}

}
