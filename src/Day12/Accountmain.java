package Day12;

public class Accountmain {

	public static void main(String[] args)
	{
		Account ac = new Account();
		
		ac.setaccno(1001);
		System.out.println(ac.getaccno());	
		
		ac.setname("Mr. Prashant Lal");
		System.out.println(ac.getname());
		
		ac.setamt(980000.5);
		System.out.println(ac.getamt());
		
		
	}

}
