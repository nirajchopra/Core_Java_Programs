package com.rays;

public class MethodWithIfElse {
	
	static void checkAge(int age) {
		if (age>18) {
			System.out.println("Adult");
		} else {
			System.out.println("Not Adult");

		}
	}
	
	public static void main(String[] args) {
		checkAge(10);
	}

}
