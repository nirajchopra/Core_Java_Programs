package com.rays.oop.abstractt;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.area();
		r.sum();

		Shape s = new Rectangle();

		s.area();
		s.sum();

		Shape.sum();
	}

}
