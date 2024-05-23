package Day12;

public class OverLoadingMainMethod {

	///////////////////////// THIS IS IMPORTANT FEOM INTERVIEW POINT OF VIEW. /////////////////////////////                        
	
	void main (int x)
	{
		System.out.println(x);
	}
	
	void main(String s)
	{
		System.out.println(s);
	}
	void main (String s1, String s2)
	{
		System.out.println(s1+s2);
	}
	
	public static void main(String[] args) 
	{
		OverLoadingMainMethod om = new OverLoadingMainMethod();
		
		om.main(5);
		om.main("shashi");
		om.main("kesh","Teresh");
	}

}
