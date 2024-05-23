package Day13;

public class StaticDemo {
	
	static int a = 10;   // static variable 
	int b = 20;           // non static variable
	
	static void m1()                                       // static method
	{                                                         
		System.out.println("This is a static method m1");                        
	}
	
	void m2()                                               // non static method
	{
		System.out.println("This is a non static method m2");
	}
	
	void m()                            // non-static method, we can access to static and non static method and varibale.
	{
		 System.out.println(a);
		 System.out.println(b);
		 m2();
		 m1();
	}
	
	public static void main(String[] args) 
	{
/*
		System.out.println(a);             // accessing the static variable directly without using the object 
		m1();                              // accessing the static method directly without using the object 
		
		
	//	  System.out.println(b);               // this cannot be accessed , throwing error 
	//	  m2();                                  /// this cannot be accessed, throwing error
		
		StaticDemo onj = new StaticDemo();
		System.out.println(onj.b);
		onj.m2();
		
		onj.m();
*/
		}
}
