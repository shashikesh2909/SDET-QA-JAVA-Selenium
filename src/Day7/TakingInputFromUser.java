package Day7;

import java.util.Scanner;

public class TakingInputFromUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		/////// this is for int///////////        Int data tyoe cannot hold decimal values
		/*
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("The number you entered is: "+57num);
		
		*/
		
		/////// this is for decimal////////             double can hold the int value
		/*
		 
		System.out.println("enter the decimal number");
		double num = sc.nextDouble();
		System.out.println("Given value is "+num);
		
		*/
		
		//////////////This is for string ////////////
		/*
		 
		 
		System.out.println("Enter the String value");
		String str = sc.next();
		System.out.println("your string vlue is "+str);
		
		*/
		////////////////////Taking multiple from user ( console)
		System.out.println("enter two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("please select which action you want to perform add,sub,mul,div   -- please ensure you are netring these same operation");
		String opr =sc.next();
		
		switch (opr)
		{
		case "add" : System.out.println(num1+num2);
					break;
		case "sub" : System.out.println(num1-num2);
					break;
		case "mul" : System.out.println(num1*num2);
					break;
		case "div" : System.out.println(num1/num2);
					break;
		default: System.out.println("Invalid");
		};
	}
}