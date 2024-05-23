package Day4;

public class AssignmentConditional {

	public static void main(String[] args) 
	{
		///////Assignment1:  Largest of two numbers (if ternary operator, if else//////
		
		/*
		int num1 = 40, num2 = 20, num3 = 30;
		System.out.println("First number : "+num1+"\nSecond number: "+num2+"\nThird number: "+num3);
		
		///////// using if else condition //////
		
		if (num1>num2)
			System.out.println("Largest of the two number is"+num1);
		else
			System.out.println("Largest of the two number: "+num2);
		
		
		
		/////// Using ternary operator ///////
		System.out.println(num1 > num2 ? "largest number is: "+num1:"largest number is: "+num2);
		
		
		
		//////SMALLEST OF 3 NUMBERS//////////
		if (num1<num2 && num1<num3)
		{
			System.out.println("Smallest number: "+num1);
		}
		else if (num2<num1 && num2<num3)
		{
			System.out.println("Smallest number: "+num2);
		}
		else
		{
			System.out.println("Smallest number: "+num3);
		}
		
		*/
		
		///// print day number based on corresponding day name (switch case)/////
		
		String day = "thursday";
		
		switch (day)
		{
		case "monday": System.out.println(1);
		break;
		case "tuesday": System.out.println(2);
		break;
		case "wednesday": System.out.println(3);
		break;
		case "thursday": System.out.println(4);
		break;
		case "friday": System.out.println(5);
		break;
		case "saturday": System.out.println(6);
		break;
		case "sunday": System.out.println(7);
		break;
		default: System.out.println("invalid");
		}	
	}

}
