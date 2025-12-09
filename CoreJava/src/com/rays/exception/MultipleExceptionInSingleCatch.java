package com.rays.exception;

public class MultipleExceptionInSingleCatch {
 public static void main(String[] args) {
	String name = "abc";
	try {
		System.out.println(name.charAt(4));
	} catch (ArithmeticException | StringIndexOutOfBoundsException e) {
		System.out.println(e);
	} finally {
		System.out.println("finally");
	}
}
}
