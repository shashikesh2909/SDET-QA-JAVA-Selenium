package Day15;

interface A
{
	int a = 10;
	void display();
}

interface B
{
	int b =20;
	void show();
}



public class MultipleInharitanceExample implements A,B
{

	public void display()
	{
		System.out.println(a);
	}
	
	public void show()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		MultipleInharitanceExample obj = new MultipleInharitanceExample();
		
		
		obj.display();
		obj.show();
	}

}
