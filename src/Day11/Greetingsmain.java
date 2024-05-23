package Day11;

public class Greetingsmain {

	public static void main(String[] args) 
	{
		Greetings gr1 = new Greetings();
		gr1.m1();
		
		Greetings gr2 = new Greetings();
		String mess = gr2.m2();
		System.out.println(mess);
		
		Greetings gr3 = new Greetings();
		gr3.m3(" bhai main mein parameter mein daala hai object call pe, mazze a agye",2);
		
		Greetings gr4 = new Greetings();
		String msg = gr4.m4("Shashi Bhai");
		System.out.println(msg);
	}

}
