package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseListUsingCollectionMethod {

	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		
		System.out.println("Original list : " + l);
		Collections.reverse(l);
		System.out.println("Reverse List : " + l);
	}
}
