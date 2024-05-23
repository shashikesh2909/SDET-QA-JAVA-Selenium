package Day5;

public class Iterationdemo {

	public static void main(String[] args) 
	{
		///// example 1: print 1 to 10 numbers.
		
		//int i=10;                                   // Initialisation
		/* 
		while(i<=10)                              // while conditioning where to stop
		{
			System.out.println(i);                //  perform action if the condition is true
			i++;                                  // inrementation
		} 
		
		
		//// Example 2: print hello message 10 times
		
		while (i<=10)
		{
			System.out.println("Hello");
			i++;
		}
		
		*/
		
		//// Example 3 : print all the even number between 1 to 10 
		/*
		 // Approach 1 
		while (i<=10) 
		{ 
			if ( i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
		
		
		// approach 2
		int i = 2;
		
				while(i<=10)
				{
					System.out.println(i);
					i=i+2;
				}
		
		
		// Example 4: 1 odd, 2 even, 3 odd, 4 even, 5 odd....till 10
		
		while(i<=10)
		{
			if (i%2==0)
			{
				System.out.println("This is even number: "+i);
			}
			else 
			{
				System.out.println("This is odd number : "+i);
			}
			i++;
		}
		
	
		
		//Example 5 : print number in descending order from 10 to 1
		
		while (i>=1) 
		{
			System.out.println(i);
			i--;
		}
			*/
		
	/////////////////////////////////////////////////////////////////////////////////////////
		// WHILE LOOP WITHOUT PUTTING ANY CONDITION JUST THE BOOLEAN VALUE.
			int i=1;
			while(true)
			{
				System.out.println("print hello");
				if (i==5)
				{
				break;
				}
				i++;
			}
	}
}
