package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class interview 
{
	public static void main(String[] args)
	{
	
		//  Assignment 1: to reverse every element which is seprated by white space.
		//	i/p: my name is shashikesh Kumar and i a 50 year old       o/p : ym eman si hsekihsahs ramuK dna i a 05 raey dlo 
/*	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		String a[];
		
		a =s.split(" ");
		String rev =" ";
		String r[] = new String[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for (int j = a[i].length()-1;j>-1;j--)
			{
				rev = rev + a[i].charAt(j);
			}
			r[i]=rev;
			rev = " ";
			System.out.print(r[i]);
		}
*/		
		
	//	Assignment 2 : occurence of all the element.: how many times the element is being repeated. 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		char[] c;
		int count = 0;
		c = s.toCharArray();
		
		for (int i=0;i<c.length;i++)
		{
			for (int j=0;j<c.length;j++)
			{
				if (c[i]==c[j])
				count++;
			}
			System.out.println("count for "+c[i]+" is "+count);
			count=0;
			
		}
		
		
		System.out.println(Arrays.toString(c));








	}
}
