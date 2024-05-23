package Day13;

public class ThisKeyword {
	
	int x,y;                // class variable/instance variable   these
	
	ThisKeyword (int x , int y)
	{
		this.x = x;                  // this is always representing the class.
		this.y = y;
	}
	
	void display ()
	{
		System.out.println(this.x);
		System.out.println(this.y);

	}
	public static void main(String[] args)      // local variables
	{
		ThisKeyword obj1 = new ThisKeyword(100,200);
		obj1.display();
		
	}

}
