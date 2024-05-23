package Day11;

public class CnstructorDemo {
	
	int x,y;
	
	CnstructorDemo ()
	{
		x =100;
		y =200;
	}
	
	CnstructorDemo(int a, int b)
	{
		x = a;
		y=b;
	}
	
	void sum ()
	{
		System.out.println(x + y);
	}

	public static void main(String[] args) 
	{
		CnstructorDemo cd = new CnstructorDemo(500,700);
		cd.sum();
	}

}
