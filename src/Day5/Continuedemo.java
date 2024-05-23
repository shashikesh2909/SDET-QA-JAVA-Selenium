package Day5;

public class Continuedemo {

	public static void main(String[] args) 
	{
		for (int i=1;i<11;i++)
		{
			if (i==5)
			{
				continue;                         /// The iteration will be not conitnue with one iteration and go back to iteration for executing the code with next incremented value
			}
			System.out.println(i);
		}
	}

}
