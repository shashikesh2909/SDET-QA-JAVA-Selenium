package Day8;

import java.util.Arrays;

public class Stringmethod {

	public static void main(String[] args)
	{
		// String s = "welcome";
		/*
		String s = new String("welcome");
		//s.length() : length of string
		//System.out.println(s.length());          // s.length()   gives the number of character in a string. This return a int type data
		System.out.println("welcome".length());     // 2nd wat to check the length 
		
		
		String s1 = "Hey !";
		String s2 = "This is Shashikesh";
		String s3 = " Welcome";
		
		//s1.concat(s2);       used to concatenate the two strings
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));                // join or concatenate the two string.
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2.concat(s3));
		System.out.println(s1.concat(s2).concat(s3));         // combination of concat() method and + operator for concatenating the multiple string.
		System.out.println(s1.concat(s2)+s3);
		
		// s.trim()      used to remove all the spaces from left and right.
		s = "  welcome  ";
		System.out.println(s.trim());                          // a.trim() Removes all the spaces from left and right
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));                       // a.charAt(index number)  given the character at the passed index value
		
		//s.contains("what we want to check is contained");      used to check whether the entered string is there in the main string
		System.out.println(s.contains("com"));                 // It check whether we the string we want to check is the part of the string.s1.contains(s2)   return the true or false ( boolean value.
		System.out.println(s.contains("  "));
		System.out.println(s.contains(" welc"));

		
		
		// equals() , equalsIgnoreCase()                      compare the two strings
		
		String s1 ="welcome";
		String s2 ="Welcome";
		System.out.println(s1 == s2);                    // this is case sensitive 
		System.out.println(s1.equals(s2));               // this is case sensitive 
		System.out.println(s1.equalsIgnoreCase(s2));       // this is case insensitive
	
		
		//replace()                replace  single/multiple(sequence) of characters in a string
		String s = " welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e','x'));                         // replaced character : did not change the original value
		System.out.println(s.replace("selenium", "rock"));             // replaced the    : did not change the value
		System.out.println(s);

		
		//substring()                       extract substring from main string.        
		String s = "appreciation";
		System.out.println(s.substring(0,3));     // The the starting index becomes a part of the substring but the last index is not the part of the substring.
		System.out.println(s.substring(0,8));
		
		// converting the case                              convert the case for a string.
		String s = "WelCome";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		
		//split()                                  split the string into multiple parts based on delimeter
		String s = "abc123@gmail.com";
		String a[] = s.split("@");             //on the basis of delimeter (with reference to we want ot devide) the split string can be stored directly in array then it can be used, no change on the original string.
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.ToString(a));

		//example 2:  just want the number using string method
		String amount = "$15,20,55";
		String a = amount.replace("$","").replace(",","");
		System.out.println(a);
		
		//example 3: separate all the string in one storng s
		String s = "abc,123@xyz";
		String a = s.replace("@",",");
		String arr[] = a.split(",");
		System.out.println(Arrays.toString(arr));
*/	
		 // * % & ^ & ( )   we cannot use these characters as a delimiter.
		
		// example 4 string name = " ohn Kennedy"; john is a part of this string or not.
		String name = "John Kenedy";
		System.out.println(name.contains("john"));
		System.out.println(name.replace("J", "j").contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
 		
	}

}
