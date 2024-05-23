package Day14;

class bank
{
	int getroi()
	{
		return 0;
	}
}

class sbi extends bank
{
	int getroi()
	{
		return 15; 						  // body is different overriding 
	}
}
class axis extends bank
{
	int getroi()
	{
		return 10;                   // body is different overriding 
	}
	
}
class icici extends bank
{
	int getroi()
	{
		return 12;                  // body is different overriding 
	}
}



public class Test {

	public static void main(String[] args) 
	{	
		sbi obj1 = new sbi();
		System.out.println(obj1.getroi());
		
		axis obj2 = new axis();
		System.out.println(obj2.getroi());
		
		icici obj3 = new icici();
		System.out.println(obj3.getroi());
	}
}
