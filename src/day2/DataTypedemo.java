package day2;

public class DataTypedemo {

	public static void main(String[] args)
	{
		
		// Numeric data type : byte, short, int, long
		
		int a=100,b=200;
		a = 300;
		System.out.println("Value of a:"+a);
		System.out.println("Value of a:"+b);
		System.out.println("Sum of a and b:"+""+(a+b));
		System.out.println(a+b);
		
		byte by = 121;
		System.out.println("This is byte "+by);
		
		Short sh = 32000;
		System.out.println("This is short "+sh);
		
		long l = 123456789123456789L ;               // Need to use L as a literal for long data type 
		System.out.println("This is long "+l);
		
		// Decimal Numbers - Float, double
		
		double d = 15.55555;
		System.out.println("This is double "+d);
		
		float f = 15.75F;                        // Need to add literal F in case of using float
		System.out.println("This is float "+f);
		
		char ch ='a';                           // For char data type single quote and single character can be used '' 
		System.out.println("This is char "+ch);

		
		String s= "john";                       // for string data type number of character is not a constraint but we have to use double quote ""
		System.out.println("This is string "+s);
		
		boolean bo=false;
		System.out.println("This is boolean "+bo);

		
		




	}

}
