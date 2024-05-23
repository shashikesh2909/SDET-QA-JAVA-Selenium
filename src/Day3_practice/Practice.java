package Day3_practice;
import java.util.*;
import java.io.*;

public class Practice 
{

	public static void main(String[] args)
	{
		/*
		// Swapping of two number
		
		int a=-1523, b=1728;
		// using the third variable
		System.out.println("The original value of a & b before making the swap"+"\na: "+a+"\nb: "+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swap value is"+"\na: "+a+"\nb: "+b);
		// Using just the arithmetic operation.
		// Method 1
		a = a+b;
		b = a-b;
		a = a-b;
	
		
		//Method 2
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swap value is"+"\na: "+a+"\nb: "+b);
	*/
		
	
		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		        int a=0,b=0,n=0;
		        for(int i=0;i<t;i++)
		        {
		             a = in.nextInt();
		             b = in.nextInt();
		             n = in.nextInt();
		        }    
		             int sum =0;
		            
		        for (int i=0;i<t;i++)
		        {
		            for (int j=0;j<n;j++)
		            {
		                sum = sum +a+(i+1)*b;
		                System.out.print(sum);
		            }
		            
		        }
		        
		        in.close();
	}   

}