package Day10;

public class Employeemain {

	public static void main(String[] args) 
	{	
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "Ram";
		emp1.job = "Manager";
		emp1.sal = 15000;
		
		emp1.display();
				
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.ename = "Shyam";
		emp2.job = "Associate";
		emp2.sal = 10000 ;
		
		emp2.display();
	}

}
