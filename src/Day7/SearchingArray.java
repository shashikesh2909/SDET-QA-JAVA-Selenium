package Day7;

import java.util.Arrays;

public class SearchingArray {

	public static void main(String[] args) 
	{
	///////// Example 1///////////////////////////////////////
	// search an element in an array 
	/*	
	 * 
		int a[] = {10,30,30,40,20};         // array
		int x=20;                           // element that needs to be searched.
		
		///// Using normal loop
		for (int i=0;i<a.length;i++)
		{
			if (x==a[i])
			{
				System.out.println("This is present at index: "+i);
				break;
			}
		}
	*/
		//// Using Enhanced loop doing the linear search.
/*		boolean status = false;
		for (int l:a)
		{
			if (x==l)
			{
				System.out.println("this is present");
				status = true;
				break;
			}
			else
			{
				status = false;
			}
		}
		if (status==false)
		{
		System.out.println("this is not present");
		}
*/		
		
////// example 2 : How many times element is repeated./////////
/*		

		int a[]= {10,20,30,40,60,30,30,30,20};
		int x=20,count=0;
		for (int i:a) 
		{
			if (i==x)
			{
				count++;
			}
		}
		System.out.println("The "+x+" is repeated "+count+" times");
*/
		
////////// Example 3: Sorting the element///////////////
		//// ascending order 
		/*
		int a[]= {5,9,4,1,6,9,84,49,44};
		int temp=0;
		for (int i=0;i<a.length-1;i++)
		{
			for(int k=0;k<a.length-1;k++)
			{
				if (a[k]>a[k+1])
				{
				temp=a[k+1];
				a[k+1]=a[k];
				a[k]=temp;
				}
			}
		}
		for (int l:a)
		{
			System.out.println(l);
		}
		*/
		
		//// descending order
		/*
		int a[]= {5,9,4,1,6,9,84,49,44};
		int temp=0;
		for (int i=0;i<a.length-1;i++)
		{
			for(int k=0;k<a.length-1;k++)
			{
				if (a[k]<a[k+1])
				{
				temp=a[k+1];
				a[k+1]=a[k];
				a[k]=temp;
				}
			}
		}
		for (int l:a)
		{
			System.out.println(l);
		}
		*/

		
		///// Sorting using predefined method ////
		/*
		  
		 
		int a[]= {5,9,4,1,6,9,84,49,44};
		System.out.println("Before sort: "+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After sort: "+Arrays.toString(a));
		
		*/
		
		//////////////// sorting of char//////////////////////
		/*
		 
		 
		char s[]= {'a','c','b','a'};
		System.out.println("before sort: "+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sort: "+Arrays.toString(s))

		*/
		
		
		//////////////// sorting of string//////////////////////
		/*

		String s[]= {"Aryan","Abhishek","Kaluu","Donu","Pihoo"};
		System.out.println("before sort: "+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sort: "+Arrays.toString(s));
		
		*/
		 ///////////////reversing an array ///////////////////
		
		int a[]= {5,9,4,1,6,9,84,49,44};
		
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+", ");
		}	
	}
}
