package com.rays.collection;

public class AutoboxingUnboxing {
	
	public static void main(String[] args) {

		// Autoboxing 
		// primitive data converted into object
		int a = 1;
		Integer b = a;

		System.out.println( b);
		
		// unboxing
		
		Integer c = new Integer(15);
		int d = c;
		System.out.println(d);
	}

}
