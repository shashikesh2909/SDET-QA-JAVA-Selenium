package Day14;


class parent 
{
	void display(int x)
	{
		System.out.println(x);
	}
}

class child1 extends parent
{
	void show (int y)
	{
		System.out.println(y);
	}
}

class child2 extends parent
{
	void print (int z)
	{
		System.out.println(z);
	}
}

public class HeirarchyInheritance {

	public static void main(String[] args) 
	{
		child1 c1 = new child1();
		c1.display(100);
		c1.show(200);
		
		child2 c2 = new child2();
		c2.display(500);
		c2.print(800);
	}

}
