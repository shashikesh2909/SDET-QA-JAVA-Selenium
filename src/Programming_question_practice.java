import java.util.Arrays;
import java.util.Scanner;

public class Programming_question_practice {
	
	public static void main(String[] args) 
	{
		// Write code to filter duplicate elements from an array and print as a list.
		
/*		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please enter how many elements of array you want to enter");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int a[] = new int[size];
		System.out.println(" Enter the element of array");
		for (int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Entered array is : "+Arrays.toString(arr));
		int count =0; 
		for ( int i =0; i<size;i++)
		{
			for (int j =0 ; j<size;j++)
			{
				if (arr[j] == arr[i])
						{
							count++;
						}
			}
			if (count >= 2)
			{
				System.out.println(arr[i]);
			}
			count = 0;
		}
		
		
		// Write code to sort the list of strings using Java collection.
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please enter how many elements of array you want to enter");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println(" Enter the element of array");
		for (int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Entered array is : "+Arrays.toString(arr));
		int temp = 0;
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));


		
// Program 1.1 :  read the coordinate of two point and calculate the distance between the point
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the coordinate of first point");
	Double p11 = sc.nextDouble();
	Double p12 = sc.nextDouble();
	System.out.println("Enter the coordinate of second point");
	Double p21 = sc.nextDouble();
	Double p22= sc.nextDouble();
	
	Double d = Math.sqrt((p11-p21)*(p11-p21)+(p12-p22)*(p12-p22));
	
	System.out.println("distance is : " +d);
 
		
//Program 1.2 :  convert celcius to farenthit and vice versa 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for entereting temperature in farenheit " + "\nEnter 2 for entering temperature in celsius ");
		int n = sc.nextInt();
		
		System.out.println("Enter the temperature");
		Double temp = sc.nextDouble();
		
		if(n == 1)
		{
			System.out.println(farh(temp));
		}
		else if ( n == 2)
		{
			System.out.println(cel(temp));
		}
}
	
	static Double farh(Double t)
	{
		Double con = 1.8*t +32;
		return con;
	}
	
	static Double cel(Double t)
	{
		Double con = (t-32)/1.8 ;
		return con;
	}
	
*/
		//Program 1.3 : Prepare the four function calculator 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = 0;
		
		System.out.println("Enter the operator (+,-,*,/  : ");
		String oper = sc.next();
		
		switch (oper)
		{
		case "+" : r = a+b;
		break;
		case "-" : r =a-b;
		break;
		case "*" : r = a*b;
		break;
		case "/" : r = a/b;
		break;
		}
		System.out.println("Result is:  " +r );
/*		

		//Program 1.4 : input week days and translate to its equivalent name of the day.	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of week's day (1-7) : ");
		
		int n = sc.nextInt();
		
		switch (n)
		{
			case 1 : System.out.println("Monday");
			break;
			case 2 : System.out.println("Tuesday");
			break;
			case 3 : System.out.println("Wednesday");
			break;
			case 4 : System.out.println("Thursday");
			break;
			case 5 : System.out.println("Friday");
			break;
			case 6 : System.out.println("Saturday");
			break;
			case 7 : System.out.println("Sunday");
			break;	
		}
		sc.close();
	
		
		//Program 1.5 : Print 1 to 10
	for (int i=1;i<11;i++)	
	{
		System.out.print(i + " ");
	}
	
	
	//Program 1.6 : Print factorial of a number using while loop 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int n = sc.nextInt();
		
		int i = 1;
		int fact = 1;
		while ( i <= n )
		{			
			fact = fact * i;
			i++;
		}
		
		System.out.println("Factorial of "+ n + " is "+fact);

		
		//Program 1.7 : to check whether the string is pallindrome or not
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		String rev = "";
		
		for (int i=s.length()-1;i>-1;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}

		
		//Program 1.8 : read the sales of 2 sales man in 5 months and print the total sales 
		
		Scanner sc = new Scanner(System.in);
		
		int sales[][]= new int[3][5];
		System.out.println();
		for ( int i=0;i<2;i++)
		{
			System.out.println("Enter sales for salesman "+(i+1));
			for ( int j=0;j<5;j++)
			{
				System.out.println("Month " + (j+1));
				sales[i][j] = sc.nextInt();
			}
		}
		
		for (int x[]:sales)
		{
			for ( int arr : x)
			{
				System.out.println(arr + " ");
			}
			System.out.println();
		}
		

		
		//Program 1.9 : print largest element of an array.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element in an array");
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the number "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		Programming_question_practice obj = new Programming_question_practice();
		obj.m(a, n);
	}	
		
		
	static void m(int a[],int n)
	{
		int temp = 0;
		for ( int i=0;i<n;i++)
		{
			for (int j=0;j<n-1;j++)
			{
				if (a[j]>a[j+1])
					{
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
						
					}
			}
		}
		System.out.println("Largest number is: "+ a[n-1]);
		*/
	}
}
