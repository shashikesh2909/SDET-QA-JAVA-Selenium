package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment 
{
	public static void main(String[] args) 
	{
		////////// Sorting of element in array using loop  >>>> The input will take input in run time.
		/*
		int size;
		System.out.println("enter the numebr of lement in array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[]= new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter the values in array index "+i);
			a[i]=sc.nextInt();
		}
		System.out.println("The entered array is "+Arrays.toString(a));
		int temp;
		for (int j=0;j<size-1;j++)
		{
			for (int k=0;k<size-1;k++)
			{
				if (a[k]>a[k+1]) 
				{
					temp = a[k];
					a[k] = a[k+1];
					a[k+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is: "+Arrays.toString(a));
	*/
		
		/////// find missing in number in array  : number should be in range///////////////
		/*
		
		int size;
		System.out.println("enter the numebr of lement in array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[]= new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter the values in array index "+i);
			a[i]=sc.nextInt();
		}
		System.out.println("The entered array is "+Arrays.toString(a));
		
		Arrays.sort(a);
		int mnum=a[0];
		for(int i=0;i<size;i++)
		{
			if (a[i]==mnum)
			{
				mnum++;
			}
		}
		System.out.println("Missing number in range is "+mnum);
		
		*/
		
		///// Find largest and smallest number is an array;
		
		int size;
		System.out.println("enter the numebr of lement in array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[]= new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter the values in array index "+i);
			a[i]=sc.nextInt();
		}
		System.out.println("The entered array is "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("Largest number is "+a[size-1]);
		System.out.println("Lowest number is "+a[0]);

		
	}
}
