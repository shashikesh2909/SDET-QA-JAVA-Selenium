package Day9;

import java.util.Scanner;

public class StringAssignments {

	public static void main(String[] args)
	
	{
		Scanner sc =new Scanner(System.in);
		
		// Assignment1 :  check whether the string is pallindrome or not
		//Approach 1
/*		
		System.out.println("Enter the string");
		String s = sc.next();
		String rev = "";
		for (int i=s.length()-1;i>-1;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("reversed string is: "+ rev);
		if (s.equalsIgnoreCase(rev))
		{
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome.");
		}

		//Approach 2 : using StringBuffer
		
		StringBuffer s = new StringBuffer();
		System.out.println("Enter the string: ");
		s.append(sc.nextLine());
		
		StringBuffer rev = s.reverse();
		
		System.out.println(rev);
		
		if(s.toString()==rev.toString())
			{
			System.out.println("Its Pallindrome");
			}
		else
			{
			System.out.println("Its not a pallindrome");
			}

		
		// Assignmet 2: Remove the junk or special characters in string.
		
		System.out.println("Enter the string");
		String s = sc.next();
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
	
		
		//Assigment 3 : remove white spaces in a string.
		// I/p : we l co m e      O/p : welcome 
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println(s.replace(" ",""));
		
	
		// Assignment 4 :  count of the occurrence of character in a string
		//i/p: abcabbbbcababcbabb  o/p : a=no of time , b= no of time, c= no of time.
		System.out.println("Enter the string");
		String s = sc.next();
		System.out.println("Enter the char for which we need to find the occurence");
		char ch = 'b';
		char c[] = s.toCharArray();
		int count=0;
		
		for(int i=0; i<c.length;i++)
		{
			if (ch == c[i])
			{
				count++;	
			}
		}
		System.out.println(ch +" =" +count);
*/	
		
		// Assignment 5: count word in a strng
		//  i/p : welcome to java selenium    o/p: 4 words.
		
		System.out.println("enter the string");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		int count=1;
		for (int i=0;i<ch.length;i++)
		{
			if(' ' == ch[i])
			{
				count++;
			}
		}
		System.out.println("Numbe of word: "+count);
		
		
		
		
		
		
		
	}
}
