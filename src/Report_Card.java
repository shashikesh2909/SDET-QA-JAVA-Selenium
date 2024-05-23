import java.util.Scanner;

public class Report_Card {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------welcome to Army Public School------------------");
	
		System.out.println(" Please enter the Student name: ");
		String name = sc.nextLine();
		System.out.println(" Please enter the Student Class (1 -12 ): ");
		int c = sc.nextInt();
		System.out.println(" Please enter the Student Section:(A-Z) ");
		String s = sc.next();

		System.out.println("----------Marks Entry--------------------");
		
		System.out.println("Enter total marks for Math theory exam: ");
		double ttm = sc.nextDouble();
		System.out.println("Enter total marks for Math Practical exam: ");
		double tpram = sc.nextDouble();
		System.out.println("Enter total marks for Math Project exam: ");
		double tprom = sc.nextDouble();
		System.out.println("enter score in math theoretical exam: ");
		double stm = sc.nextDouble();
		System.out.println("Enter score in math practical exam: ");
		double spram = sc.nextDouble();
		System.out.println("Enter score in math projects: ");
		double sprom = sc.nextDouble();
		
		
			System.out.println("Enter total marks for EVS theory exam: ");
			double tte = sc.nextDouble();
			System.out.println("Enter total marks for EVS Practical exam: ");
			double tprae = sc.nextDouble();
			System.out.println("Enter total marks for EVS Project exam: ");
			double tproe = sc.nextDouble();
			System.out.println("enter score in EVS theoretical exam: ");
			double ste = sc.nextDouble();
			System.out.println("Enter score in EVS practical exam: ");
			double sprae = sc.nextDouble();
			System.out.println("Enter score in EVS projects: ");
			double sproe = sc.nextDouble();
	
			System.out.println("Enter total marks for Hindi theory exam: ");
			double tth = sc.nextDouble();
			System.out.println("Enter total marks for Hindi Practical exam: ");
			double tprah = sc.nextDouble();
			System.out.println("Enter total marks for Hindi Project exam: ");
			double tproh = sc.nextDouble();
			System.out.println("enter score in Hindi theoretical exam: ");
			double sth = sc.nextDouble();
			System.out.println("Enter score in Hindi practical exam: ");
			double sprah = sc.nextDouble();
			System.out.println("Enter score in Hindi projects: ");
			double sproh = sc.nextDouble();
						
			System.out.println("Enter total marks for English theory exam: ");
			double ttn = sc.nextDouble();
			System.out.println("Enter total marks for English Practical exam: ");
			double tpran = sc.nextDouble();
			System.out.println("Enter total marks for English Project exam: ");
			double tpron = sc.nextDouble();
			System.out.println("enter score in English theoretical exam: ");
			double stn = sc.nextDouble();
			System.out.println("Enter score in English practical exam: ");
			double spran = sc.nextDouble();
			System.out.println("Enter score in English projects: ");
			double spron = sc.nextDouble();
			
			double tma = ttm+tpram+tprom;
			double sma = stm+spram+sprom ;
			
			double tev = tte + tprae + tproe ;
			double sev = ste + sprae + sproe ;
			
			double thi = tth + tprah + tproh ;
			double shi = sth + sprah + sproh ;
			
			double ten = ttn + tpran + tpron ;
			double sen = stn + spran + spron ;
			
			
			
		
		System.out.println("----------- Student Report Card--------------");
		System.out.println("Name   : " + name);
		System.out.println("Class  : "+ c);
		System.out.println("Section: " + s);
		System.out.println("                  Marks                       ");
		System.out.println("Subject Name | Total Marks | Theory Marks | Practical Marks | Project Marks | Math Percentage");
		System.out.println("Math         | "+sma+"        | "+stm+"         | "+spram+"            | "+sprom+"          | "+Math.round((sma/tma)*100)+"%");
		System.out.println("EVS          | "+sev+"        | "+ste+"         | "+sprae+"            | "+sproe+"          | "+Math.round((sev/tev)*100)+"%");
		System.out.println("Hin          | "+shi+"        | "+sth+"         | "+sprah+"            | "+sproh+"          | "+Math.round((shi/thi)*100)+"%");
		System.out.println("Eng          | "+sen+"        | "+stn+"         | "+spran+"            | "+spron+"          | "+Math.round((sen/ten)*100)+"%");
		double per = Math.round(((sma+sev+shi+sen)/(tma+tev+thi+ten))*100) ;
		System.out.println("Total percentage: "+ per+"%");
		if(per > 90 && per<100)
		{
			System.out.println("Grade : A");
		}
		else if(per > 80 && per<91)
		{
			System.out.println("Grade : B");
		}
		else if(per > 70 && per<81)
		{
			System.out.println("Grade : C");
		}
		else if(per > 60 && per<71)
		{
			System.out.println("Grade : D");
		}
		else if(per > 50 && per<61)
		{
			System.out.println("Grade : E");
		}
		else if(per >=45 && per<51)
		{
			System.out.println("Grade : F");
		}
		else if(per <45)
		{
			System.out.println("Failed the exam, Need to reattempt");
		}
		
		



				
	}
}

