package com.rays.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterator {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		h.add(100);
		h.add(200);
		
		Iterator it = h.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
