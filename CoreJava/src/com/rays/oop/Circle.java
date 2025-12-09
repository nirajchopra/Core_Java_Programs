package com.rays.oop;

public class Circle {
	
	private int radius;
	private String color;
	private String bordorWidth;

	public int getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBordorWidth() {
		return bordorWidth;
	}

	public void setBordorWidth(String bordorWidth) {
		this.bordorWidth = bordorWidth;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		return 3.14 * radius * radius;
	}

}
