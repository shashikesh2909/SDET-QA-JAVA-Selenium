package Day18;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
//--------------------------------------Declare the ArrayList---------------------------------------
 
     //  METHOD 1 : Creating an object of ArrayList class and any type of variable can be stored in ArrayList
		
	 	ArrayList list = new ArrayList();   // we can store any type of element
		
		
	// METHOD 2 : Creating the ArrayList for the same data type 
		
	//	ArrayList <String> list1 = new ArrayList <String>();    //strings 
	//	ArrayList <Integer> list2 = new ArrayList <Integer>();  // Integer
		
		
//--------------------------------------Adding values to ArrayList---------------------------------------
		 // we can use add keyword to add element in ArrayList.
		
		
		list.add("John");
		list.add("David");
		list.add("Scott");
		list.add("Smith");
		list.add(100);
		list.add('A');
		list.add(69.69);
		
		
//--------------------------------------Size of ArrayList---------------------------------------
		// we can use size() to find the size of the ArrayList
		
		System.out.println(list.size());
		System.out.println("before removiing the element "+list);
		
		
//--------------------------------------remove element from ArrayList---------------------------------------
	    // using the keyword remove 
		
		list.remove(2);
		System.out.println(list.size());
		System.out.println("after removiing the element "+list);
	
//--------------------------------------Add element in between ArrayList---------------------------------------
	    // using the keyword remove 
		
		list.add(1,"Bob");
		System.out.println(list.size());
		System.out.println("after inserting the element at 1st index "+list);


//--------------------------------------Read value from ArrayList using forloop------------------------------------
		
	for (Object obj : list)
	{
		System.out.println(obj);
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
