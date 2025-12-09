package com.rays.oop.abstractInterface;

public class Interface1test implements Interface1{
	public int sum(int a, int b) {
		return a+b;
	}
	public static void main(String args[]) {
		Interface1test t = new Interface1test();
		int s = t.sum(x, 10);
		System.out.println(s);
	}

}
