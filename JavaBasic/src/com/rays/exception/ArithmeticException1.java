package com.rays.exception;

public class ArithmeticException1{
	public static void main(String[] args) {
		int a = 10;
		try {
		int c = a/0;
		System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
