package Day17;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		System.out.println("Progrm started");
		
		int a =100;
		
		try 
		{
			System.out.println(a/0);
		}
		catch (Exception e)
		{
			System.out.println("in catch block");
		}
		finally                // finally blocked will be executed whether exception is thrown in try or exception is handled / not handled in catch but finally will be executed.
		{
			System.out.println("finally block ");
		}
		
		System.out.println("Program exited");

	}

}
