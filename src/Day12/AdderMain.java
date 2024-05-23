package Day12;

public class AdderMain {

	public static void main(String[] args)
	{
		Adder add = new Adder();
		
		add.sum();
		
		add.sum(10, 20);
		
		add.sum(10.0, 15);
		
		add.sum(15, 10.00);
		
		add.sum(10, 20, 30);
	}

}
