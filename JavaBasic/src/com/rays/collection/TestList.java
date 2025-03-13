package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		
		List c = new ArrayList();
		
		//Adds a new element
		
		c.add('a');
		c.add('b');
		c.add('c');
		c.add('d');
		c.add('e');
		
		System.out.println("List : " + c);
		
		c.add(2, " one");
		
		System.out.println("List : " + c.add(2));
		
		System.out.println("List : " + c.get(2));
		
		c.remove(2);
		System.out.println("List : " + c);
		
		c.set(2, "one");
		System.out.println("List : " + c);
		
		System.out.println("List IndexOf : " + c.indexOf('b'));
		
		System.out.println("List subList : " + c.subList(0, 3));
		
		
		

	}
}
