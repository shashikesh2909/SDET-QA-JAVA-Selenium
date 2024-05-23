package Day10;

public class Employee {
	
	// Variable of class employee
	int eid;
	String ename;
	String job;
	int sal;
	
	//Methods
	void display()                   // we have to specify the data type of the output of the method which needs to be placed before method name , in case there is no output then it should be kept as void                
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	/*public static void main(String[] args)
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
*/	
}
