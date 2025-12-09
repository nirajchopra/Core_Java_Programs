package com.rays.oop.polymorphismReturn;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}

}
