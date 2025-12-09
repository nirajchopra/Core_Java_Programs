package com.rays.oop.polymorphismReturn;

public class Shape {
	
	public double area() {
		return 0;
	}
	
	public static Shape getShape(int i) {
		if(i==1) {
			return new Rectangle(10, 20);
		}
		if(i==2) {
			return new Circle(10.0);
		}
		return new Shape();
	}

}
