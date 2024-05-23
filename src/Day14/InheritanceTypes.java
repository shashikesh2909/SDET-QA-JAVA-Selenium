package Day14;

// Covering single and multi level type of inheritance.

class A
{
	int a = 100;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b = 200;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c = 300;
	void print()
	{
		System.out.println(c);
	}
}


public class InheritanceTypes                           // one .java file only one public class is possible 
{
	public static void main( String args [])
	{
		B obj = new B();
		
		obj.display();
		System.out.println(obj.a);
		
		
		A obj1 = new A();
		obj.show();
		
		C cobj = new C();
		cobj.display();
		cobj.show();
		cobj.print();	
	}
	
}
