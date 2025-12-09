package com.rays.oop.shapeArray;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];
		s[0] = new Circle(2);
		s[1] = new Rectangle(3, 5);

		Rectangle r = (Rectangle) s[1];

		r.setWidth(12);
		System.out.println(s[1].area());

		// System.out.println(s[0].area());

		double a = Area(s);
		// System.out.println(a);
	}

	public static double Area(Shape[] s) {
		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
	}

}