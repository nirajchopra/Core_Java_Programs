package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		
		l.add(4,"six");
		
		for(Object obj : l) {
			String str = (String) obj;
			
			Collections.sort(l);
			System.out.println(l);
			
			ArrayList subList = new ArrayList(l.subList(1, 3));
			System.out.println(subList);
			
		}
		
		
	}
	

}
