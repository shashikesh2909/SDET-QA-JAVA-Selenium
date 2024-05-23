package Day10;

public class student_main {

	public static void main(String[] args)
	{
		Student stu1 = new Student();
		stu1.grad = 'A';
		stu1.sid = 1001;
		stu1.sname = " Shahrukh";
		
		Student stu2 = new Student();
		stu2.grad = 'D';
		stu2.sid = 1002;
		stu2.sname = " Amir Khan";
		
		stu1.display();
		stu2.display();
	}
}
