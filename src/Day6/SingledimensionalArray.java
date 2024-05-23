package Day6;

public class SingledimensionalArray 
{
	public static void main(String[] args)
	{
		/*
		Declare an array
		Add value into array
		Find size of an array
		Read single value from an array
		Read multiple value from an array
		*/
		
		/// declaring array & adding value of an array 
		//Approach 1             when the size is fixed for array in this case and no more value can be added here.No more index as well
		/*int a[]=new int[5];
		a[0]= 100;
		a[1]= 200;
		a[2]= 300;
		a[3]= 400;
		a[4]= 500;		
		*/
		
		// Approach 2    in case we don't know the size of array and we can store more values this approach is used.
		
	//	int a[]= {100,200,300,400,500,600};
		
		
		// FIND LENGTH OF AN ARRAY 
		
		//    a.lenth( gives the length of an array)    Syntax araay_name.length
		/*
		System.out.println( a.length);
		
		
		
		/// Read single value from an array 
		System.out.println(a[4]);
		
		// Read multiple values from array
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//////////////////////////////////////////////////////
		// ENHANCED FOR LOOP   FOR EACH LOOP    Syntax: for(int x:a){print(x)}    it will give all the elements of array   this is for defined array
		
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		/////////////////////////////////////////////////////////////////////////////////////
		//  TWO Dimensional Array 
		
		
		// Declaration of two dimensional array
		// Approach 1
		
	//	int a[][]= new int[3][2];
	//	int []a[]=new int[3][2];
		int [][]a=new int[3][2];
			a[0][0] = 100;
			a[0][1] = 200;
			a[1][0] = 300;
			a[1][1] = 400;
			a[2][0] = 500;
			a[2][0] = 600;
				
			
			
	//		Approach 2        Dynamically memory is allocated to the 2nd approach
	 */ 
		int a[][]= { {100,200,},
					 {300,400,500},
					 {500,600} };
	/*	
	//	System.out.println(a[1][1]);
		// total number of row can be find by a.length    
		// Total number of column in a specific row can be found by  a[row number].length
	//	System.out.println(a[1].length);
		
		
		//read single value from array 
		
	//	System.out.println(a[1][1]);
		
		// read all the values from two dimensional ray.
		 // Approach 1
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		 */
		
		// Approach 2 : enhanced loop
		
		for (int x[]:a) 
		{
			for(int arr:x)
			{
				System.out.print(arr+" ");
			}
			System.out.println(" ");
		}
		
		/* In the enhanced loop, we are able to read the values in row and column by first in loop one, the new one dimensional
		 * array is created name int x[], this x[] was storing the value of all the element in row 1. once the array contained 
		 * the value in array 1 it moved to second loop where the new int varibale is declared in which one by one the value
		 * each row value is assigned to newly created variable, this loop will be repeaded till there is no value is left 
		 * to fetch.  
		 */
	}
}
