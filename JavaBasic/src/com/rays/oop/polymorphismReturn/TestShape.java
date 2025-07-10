package com.rays.oop.polymorphismReturn;

public class TestShape {
	
	public static void main(String args[]) {
		Shape[] s = new Shape[2];
		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		
		System.out.println(s[0].area());
		System.out.println(s[1].area());
	}

}
