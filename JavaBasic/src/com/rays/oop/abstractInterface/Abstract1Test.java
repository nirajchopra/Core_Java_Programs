package com.rays.oop.abstractInterface;

public class Abstract1Test extends Abstract1{
	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String args[]) {
		Abstract1Test t = new Abstract1Test();
		
		System.out.println(t.sum(x, 10));
	}

}
