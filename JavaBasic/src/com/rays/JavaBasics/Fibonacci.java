package com.rays;

public class Fibonacci {
	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Fibonacci : ");
		for (int i = 1; i <=10; i++) {
			c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
	}

}
