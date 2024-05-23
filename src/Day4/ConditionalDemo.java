package Day4;

public class ConditionalDemo {

	public static void main(String[] args) 
	{
		/*
		// Example 1: check whether the man can vote or not  using just if condition
		int num1 = 50,num2=70,num3=-90;
		System.out.println("number 1 is: "+num1+"\nnumber 2 is: "+num2+"\nnumber 3 is: "+num3);
		
		if (age >= 18)
		{
			System.out.println("Please vote");
		}
		if (age<18)
		{
			System.out.println("Under age");
		}
		
		
		// if else statement where if the condition in statement is not correct than else statement will be executed
		
		
		if (age >= 18)
			System.out.println("Please vote");
		else
			System.out.println("Under age");
			
			
		
		// Example 2: to check whether the number is even or not
		
		
		if (num%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
			
			
		
		
		//Example 3: To check the whether the nunmber is positive negative or zero
		
		if (num >0)
			System.out.println("number is postive");
		else if(num==0)
			System.out.println("number is zero");
		else
			System.out.println("number is negative");
		
		
		// Example 4: To check the largest among 3 numbers
		
		if (num1>num2 && num1>num3)
		{
			System.out.println("Greatest number is: "+num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("Greatest number is: "+num2);
		}
		else
		{
			System.out.println("Greatest number is: "+num3);
		}
		
		
		// Example 5: as per the day number mentioned reflect the day corresponding to it.
		
		int day=3;
		
		if (day==1)
		{
			System.out.println("Monday");
		}
		else if (day==2)
		{
			System.out.println("Tueday");
		}
		else if (day==3)
		{
			System.out.println("wednesday");
		}
		else if (day==4)
		{
			System.out.println("Thursday");
		}
		else if (day==5)
		{
			System.out.println("friday");
		}
		else if (day==6)
		{
			System.out.println("saturday");
		}
		else
		{
			System.out.println("Sunday");
		}
		*/
		
		// Example 5:Using Switch case as per the day number mentioned reflect the day corresponding to it.

		int day=4;
		switch (day)
		{
		case 1: System.out.println("Monday");
		System.out.println("Bahut kaam hai");
		break;			                                   // break is stopping the execution as in switch condition once the case is matched it will start executing all the cases after the first one
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thurday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sundy");
		break;
		default: System.out.println("Invalid");            // Break is supposed to be put after the default also as if there are any code after default it will be executed without break.
		}
			
		
	}
}
