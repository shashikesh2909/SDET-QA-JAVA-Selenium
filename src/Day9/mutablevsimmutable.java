package Day9;

import java.util.Arrays;

public class mutablevsimmutable {

	public static void main(String[] args) 
	{
/*		
		// immutable : we can not change the value of the string this is called 
		
		String s = "welcome";		
		System.out.println(s);		
		System.out.println(s.concat("welcome to java"));		
		System.out.println(s);
		
		
		// Mutable : The value will be changed   >>>>> String variable are immutable
		
		int arr[] = {10,20,30,40,50,60,30,10};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
*/
		// String   vs  StringBuffer    vs StringBuilder
		
		
		String s = "welcome";
		s.concat("to java");                               // this is not changed even after the concatenation >> this is immutable
		System.out.println(s);
		
		
		StringBuffer sbuf = new StringBuffer("welcome");
		sbuf.append(" to java");                                   // the original value gets changed >> this is mutable
		System.out.println(sbuf);
		
		
		StringBuilder sbul = new StringBuilder("welcome");
		sbul.append(" not to java");                          // the original value gets changes  >> this is mutable.
		System.out.println(sbul);
		
	}

}
