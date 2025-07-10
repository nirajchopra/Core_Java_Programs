package com.rays.oop.overloading;

public class MethodOverloading {
	
	public int num(int a, int b) {
		return a+b;
	}
	public int num1(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
	
		System.out.println(m.num1(1,2,3));
		System.out.println(m.num(1,2));
	}
	
	

}
