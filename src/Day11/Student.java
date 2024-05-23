package Day11;

public class Student 
{
int sid ;                                   // this is class variables
String Sname;
char grad;

void display()
{
	System.out.println(sid + " " + Sname + "  " + grad);
}

void setStudentData(int id, String name, char gr)
{
	sid = id;                               // this is method variable / local variable and can be used in this method.
	Sname = name;
	grad = gr;
}

Student(int id , String name, char gr)
{
	sid = id;                               //Constructor is taking a parameter and assigning it to class variable.
	Sname = name;
	grad = gr;
}


}
