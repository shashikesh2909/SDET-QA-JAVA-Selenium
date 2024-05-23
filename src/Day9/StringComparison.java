package Day9;

public class StringComparison 
{
	public static void main(String[] args)
	{	
/*
		//Case 1
		// if we are creating string using the following format there is no deference in == and .equals()
		String s1 = "welcome";                                              //
		String s2 = "welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		//Case 2
		String s1 = new String("welcome");                                   // created a object named s1 and the value is "welcome/;  
		String s2 = new String("welcome");									// created a object named s2 and the value is "welcome/;
		
		System.out.println(s1==s2);            // used to compare the object   :  comparing s1 and s2 that is different, thats why its false
		System.out.println(s1.equals(s2));     // used to compare the value of object    ,  both object have same value "welcome" thats why it true.
	
		
		// case 3 
		String s1 = "abc";
		String s2 = new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
*/	
		
		//  Case 4
		 String s1 ="abc";
		 String s2 = new String("abc");
		 String s3 = s2;
		 
		 System.out.println(s1 == s2);                  // objects are different.
		 System.out.println(s1.equals(s2));             // values are same.
		 System.out.println(s2 == s3);                  // objects are same.
		 System.out.println(s2.equals(s3));             // values are same.
		 System.out.println(s1 == s3);                  // objects are different.
		 System.out.println(s1.equals(s3));             // values are same.
		 
		 

		
	}

}
