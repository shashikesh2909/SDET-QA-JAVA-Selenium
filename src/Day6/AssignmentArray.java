package Day6;
public class AssignmentArray 
{

	public static void main(String[] args)
	{
////Assignment 1: an array contain list of data, where we are suppose to return the smallest natural number ( greater than 0) which is not in array for eg int arr ={12345},  so the output should be 6.
		/*

		int a[]= {12,3,8,6,5,9,4,4};
		 int c=0;
		 for (int j=0; j<a.length;j++)
		 {
			 for (int i=0;i<a.length-1;i++)
			 {	
			 if(a[i]>a[i+1])
			 {
				c = a[i+1];
				a[i+1]= a[i];
				a[i]=c;				 
			 }
			 }
		 }
		 int small = a[0];
		 for(int i=0;i<a.length;i++)
		 {
			 if (small == a[i])
			 {
				 small = small+1;
			 }
		 }
		 System.out.println(small);
		 
		 */

////////Assignment 2 : Find summ of all the element in an array //////////////////////////////////////////////////
		/*
		 
		int arr[]= {11,22,33,44,55,66,77,88,99};
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all the element is: "+sum);
		
		*/
		
////////Assignment 3: Print even and odd number from array 
		/*
		
		int a[]= {9,6,3,8,5,2,7,4,1};
		int even=0,odd=0;
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even= "+even+"\nOdd= "+odd);
		
		*/
		
////////// check whether the number is prime or not.
/*	
 
		int x=17, count=0;  // number for which we want to check whether number is prime or not.
		for (int i=1;i<x;i++)
		{
			if (x%i==0)
			{
				count++;
			}
		}
		if (count > 1)
		{
			System.out.println("its not prime ");
		}
		else 
		{
			System.out.println("its prime");
			
*/
		
		
		
	}
}