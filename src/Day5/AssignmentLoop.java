package Day5;

public class AssignmentLoop {

	public static void main(String[] args)
	{
		/*
		// Assignment 1 : Reverse a number --- input 1234   output--- 4321   need to use (% / = operator)
		int num = 12345678;
		int rev=0,val=0;
		while (num!=0)
		{
			val = num%10;
			num = num/10;
			rev = rev*10 + val;		
		}
		System.out.println(rev);
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Assignment 2 : CHeck whether the number is Palindrome or not mean if we revere number 121 the end result will be the same. conditional statement operator 
		
		int num = 1231;
		int val=0, rev=0,og;
		og = num;
		while (num!=0)
		{
			val = num%10;
			num = num/10;
			rev = rev*10+val;
		}
		if (rev==og)
		{
			System.out.println("its a palindome");
		}
		else
		{
			System.out.println("Its not a palindrome ");
		}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Assignment 3 : check the number of digit in a number
		int num=45516516;
		int val=0;
		while (num!=0)
		{
			num=num/10;
			++val;		
		}
		System.out.println(val);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Assignment 4 : Cunt number of even and odd digit in a number for eg 23456  even = 3 odd = 2
		int num = 1234862;
		int even=0, odd=0, val=0;
		while (num!=0)
		{
			val = num%10;
			num = num/10;
			if (val%2 ==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Odd digit: "+odd);
		System.out.println("even digit: "+even);
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Assignment 5 : Find sum of digit in a number
		int num = 66666;
		int sum = 0, val =0;
		while(num!=0)
		{
			val = num%10;
			num = num/10;
			sum = sum + val;
		}
		System.out.println("Sum of all digits "+sum);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//FIBONACCI SERIES	: 011235813....     NEXT NUMBER IS THE ADDITION OF LAST TWO NUMBERS
		int a=1,b=1, sum=0;
		System.out.println("start from 0");
		for (int i=0;i<11;i++)
		{
			sum = a+b;
			System.out.println(sum);	
			a=b;
			b = sum;		
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//TRIANGULAR SERIES	: SUM OF NATURAL NUMER IS THE SERIES LIKE 1,3,6,10.....  
		int sum=0;
		for (int i=0;i<11;i++)
		{
			sum = sum+i;
			System.out.println(sum);
		}
	
		//////////////////////////////////////  Pattern Printing /////////////////////////////////////
int row=5, col=5;
Star Pattern 1

* 

* * 

* * * 

* * * * 

* * * * *   

 
		int row=6, col=6;
		for (int i=0;i<row;i++)
		{	
			for (int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
//////////////////////////////////////////////////////////////////////////////////	////
		
		Star Pattern 2

		* * * * * 

		* * * * 

		* * * 

		* * 

		*  

		
		for (int i =0;i<row;i++)
		{
			for (int j =0;j<col;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			col--;
		}
//////////////////////////////////////////////////////////////////////////////////////		
//Star Pattern 3

		* 

		* * 

		* * * 

		* * * * 

		* * * * * 

		* * * * 

		* * * 

		* * 

		*   
		
		

		for (int i=0;i<row;i++)
		{
			for (int j=0;j<i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=row;i>=0;i--)
		{
			for (int j=0;j<i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			col--;
		}

/////////////////////////////////////////////////////////////////////////////////////		
//		Star Pattern 4

        * 

      * * 

    * * * 

  * * * * 

* * * * * 

		int row=5, col = 5;
		
	for ( int i=1;i<=row;i++)
	{
		for(int j=col-1;j>-1;j--)
		{	
			System.out.print(" ");
		}
		col--;
		for ( int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
/////////////////////////////////////////////////////////////////////////////////////		
//	Star Pattern 5

	* * * * *

	  * * * *

	    * * *

	      * *

	        * 
 
		int row=5, col = 5;
		
		for ( int i=1;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{	
				System.out.print(" ");
			}
			for ( int k=col;k>0;k--)
			{
				System.out.print("*");
			}
			col--;
			System.out.println(" ");
		}
		
		Star Pattern 6

	    *

	   **

	  ***

	 ****

	*****

	 ****

	  ***

	   **

	    *  
	

		int row=5;
		int col=row;
		for(int i=0;i<=row;i++) 
		{
			for (int j=col;j>0;j--)
			{
				System.out.print(" ");
			}
			col--;
			for (int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		col=row;
		for (int i=0;i<=row-1;i++) 
		{
			for (int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for (int j=col;j>0;j--)
			{
				System.out.print("*");
			}
			col--;
			System.out.println();
		}
		int row = 5;
		int col = row;
		for (int i=0;i<5;i++)
		{
			for (int j=col;j>0;j--)
			{
				System.out.print(" ");
			}
			col--;
			for ( int k=0; k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		/////////////////////////////////////////////////////////////////////////
		// PAttern 6
	    	*	        *
		     *		  *
		      *		 *
				*  *
				 *
						
*/
		int row =5;
		int col = row;
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<=i;j++)
				{
				System.out.print(" ");
				}
				System.out.print("*");
				
			for(int k=col+4;k>1;k--)
				{
					System.out.print(" ");
				}
				col=col-2;
				System.out.print("*");
				
				System.out.println();
				
		}
		
	}
	}
		
		
			

		
