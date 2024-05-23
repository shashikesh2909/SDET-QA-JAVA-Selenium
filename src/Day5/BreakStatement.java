package Day5;

public class BreakStatement {

	public static void main(String[] args) 
	{
		for (int i=1;i<11;i++)
		{
			if (i==5)
			{
				break;                         /// The iteration will be completely break right after the condition is met and break is executed
			}
			System.out.println("hell0");
		}
	}

}
