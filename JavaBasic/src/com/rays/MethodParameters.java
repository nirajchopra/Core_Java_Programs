package com.rays;

public class MethodParameters {
	
	static void myMethod(String fname) {
		System.out.println(fname + "Refsnes");
	}
	public static void main(String[] args) {
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
	}

}
