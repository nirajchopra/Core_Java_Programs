package com.rays.methodreturn1;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1); // Rectangle
		s[1] = Shape.getShape(2); // Circle
		s[2] = Shape.getShape(3); // Triangle

		if (s[0] instanceof Rectangle) {
			Rectangle r = (Rectangle) s[0];
			r.setLength(50); // Updating length for Rectangle
		}

		for (int i = 0; i < s.length; i++) {
			s[i].area(); // Calls overridden methods
		}
	}
}
