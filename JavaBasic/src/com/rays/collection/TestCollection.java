package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		//Adds a new element
		
		c1.add('1');
		c1.add('2');
		c1.add('3');
		c1.add('4');
		c1.add('5');
		
		Collection c2 = new ArrayList();
		
		c2.add('a');
		c2.add('b');
		c2.add('c');
		c2.add('d');
		c2.add('e');
		
		System.out.println("c1 add : " + c1);
		System.out.println("c2 add : " + c2);
		
		//Adds a Collections
		
		c1.addAll(c2);
		System.out.println("c2 addAll : " + c2);
		
		//Removes all elements
		
		c1.clear();
		System.out.println("c1 clear : " + c1);
		
		//Membership checking
		
		System.out.println("c1 Contains : " + c1.contains(1));
		
		//Inclusion checking
		
		System.out.println("c1 ContainsAll : " + c1.containsAll(c2));
	    
	    //Whether it is empty
	    
	    System.out.println("c1 IsEmpty : " + c1.isEmpty());
	    
	    //Removes an elements
	    
	    c2.remove('a');
	    System.out.println("c2 remove : " + c2);
	    
	    //Removes all elements matching passed collection
	    
	    c2.removeAll(c1);
	    
	    System.out.println("c2 removeAll : " + c2);
	    
	    
	    //The number of element
	    
	    System.out.println("c1 Size : " + c1.size());
		
		//Retains the elements matching passed collection
	    
	    c1.retainAll(c2);
	    System.out.println("c1 retainAll : " + c1);
	    System.out.println("c2 retainAll : " + c2);
		
		
	}

}
