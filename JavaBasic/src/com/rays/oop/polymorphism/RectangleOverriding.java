package com.rays.oop.polymorphism;

public class RectangleOverriding extends ShapeOverriding {

	private int length;
	private int width;

	public RectangleOverriding(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

}
