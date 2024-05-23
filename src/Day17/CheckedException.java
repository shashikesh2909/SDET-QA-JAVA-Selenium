package Day17;

public class CheckedException {

	public static void main(String[] args) 
	{
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		try 
			{
			Thread.sleep(5000);
			} 
		catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
		
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
