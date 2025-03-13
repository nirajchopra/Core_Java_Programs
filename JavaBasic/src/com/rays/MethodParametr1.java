package com.rays;

public class MethodParametr1 {
	
	static void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
	
	public static void main(String[] args) {
		myMethod("Liam",3);
		myMethod("Jenny",4);
		myMethod("Anja",5);
	}

}
