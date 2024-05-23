package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput 
{

	public static void main(String[] args) 
	{
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many enteries needsed to add into array: ");
		size=sc.nextInt();
		int a[]= new int [size];		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enether the "+i+" index value");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));	
	}
}
