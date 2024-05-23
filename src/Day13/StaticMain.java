package Day13;

public class StaticMain {

	public static void main(String[] args) {
		System.out.println(StaticDemo.a);             // accessing the static variable directly without using the object 
		StaticDemo.m1();                              // accessing the static method directly without using the object 
		
		
	//	  System.out.println(b);               // this cannot be accessed , throwing error 
	//	  m2();                                  /// this cannot be accessed, throwing error
		
		StaticDemo onj = new StaticDemo();
		System.out.println(onj.b);
		onj.m2();
		
		onj.m();

	}

}
