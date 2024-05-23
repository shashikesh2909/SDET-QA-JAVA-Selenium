import java.util.Scanner;

public class multiperform_calc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Select the operation (+ , - , * , /");
		String op = sc.next();
		int r = 0;
		int n = 0;
		
		switch (op)
		{
		case "+" : r = a+b;
		break;
		case "-" : r = a-b;
		break;
		case "*" : r = a*b;
		break;
		case "/" : r = a/b;
		break;
		}
		System.out.println("Result :" + r);
		
		String s = "";
		int i = 0; 
		System.out.println("want to perform any more operation (y/n)");
		s = sc.next();
		while (s.equals("y"))
		{
			System.out.println("Select the operation (+ , - , * , /");
			 op = sc.next();
			System.out.println("Enter the number");
			n = sc.nextInt();
			
			 switch (op)
				{
				case "+" : r = r+n;
				break;
				case "-" : r = r-n;
				break;
				case "*" : r = r*n;
				break;
				case "/" : r = r/n;
				break;
				}
				System.out.println("Result :" + r);
				System.out.println("want to perform any more operation (y/n)");
			s = sc.next();
			i++;
		}
		System.out.println("Thanks for using the calculator");
		
		 
	}

}
