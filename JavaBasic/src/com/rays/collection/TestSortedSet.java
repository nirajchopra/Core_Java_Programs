package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add("one");
		s.add("two");
		s.add("three");
		
		for(Object obj : s) {
			System.out.print(obj + " ");
			
			System.out.println(s.first());
			System.out.println(s.last());
		}
	}

}
