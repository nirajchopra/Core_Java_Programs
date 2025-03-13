package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise1 {
	public static void main(String[] args) {
		
		ArrayList c1 = new ArrayList();
		
		c1.add('a');
		c1.add('b');
		c1.add('c');
		c1.add('d');
		c1.add('e');
		
		c1.add(1, 'f');
		
		Iterator it = c1.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			System.out.println(obj);
			
		}
		
		
		
	
	}

}
