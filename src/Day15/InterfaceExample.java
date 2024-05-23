package Day15;

interface Testint
{
	int a =10;     				// by default variable is static and final 
	void display();             // abstract method
}


public class InterfaceExample implements Testint{
	
	public void  display()
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Testint obj = new InterfaceExample();
		obj.display();
	}

}
