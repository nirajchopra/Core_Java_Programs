package com.rays.java.exercise;

public class MultipleObject {
	int x = 5;
	
	public static void main(String[] args) {
		MultipleObject obj1 = new MultipleObject();
		MultipleObject obj2 = new MultipleObject();
		
		obj2.x = 25;
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		
	}

}
