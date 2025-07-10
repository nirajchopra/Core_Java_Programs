package com.rays.oop.polymorphism;

public class TestShapeOverriding {

	public static void main(String args[]) {

		ShapeOverriding s1 = new RectangleOverriding(10, 20);
		ShapeOverriding s2 = new CircleOverriding(10.0);

		System.out.println(s1.area());
		System.out.println(s2.area());
	}

}
