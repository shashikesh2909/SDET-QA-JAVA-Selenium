package Day17;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		System.out.println(" Started ");
		try 
		{
			String s = null;
			System.out.println(s.length());       // NullPointerException : If there is no value to return like a length of a null string.
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Entered into catch bloak of null exception");
		}
		
		System.out.println("Program in progress although code have exceptions");
		
		try
		{
			int a = 10;
			System.out.println(a/0);              // ArithmeticException  :If we are dividing the number by zero 
		}
		catch (ArithmeticException e)
		{
			System.out.println("Entered into catch block for arithmetic esception");
		}
		
		System.out.println("Program in progress although code have exceptions");
		
		try 
		{
			String st = "shashi";
			int i = Integer.parseInt(st);          // NumberFormatException :  we are trying to convert the data type of a string variable that contains only variable
			System.out.println(i);
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(" stopped");
	}

}
