package com.rays.oop.sup;

public class Shape {
	
	private String color;
	private int bordorWidth;
	
	public Shape() {
	}

	public Shape(String color, int borderWidth) {
		this();
		this.color = color;
		this.bordorWidth = bordorWidth;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getBordorWidth() {
		return bordorWidth;
	}
	
	public void setBordorWidth(int bordorWidth) {
		this.bordorWidth = bordorWidth;
	}
	
	public double area() {
		System.out.println("Shape Area Method..!!!");
		return 0;
	}


}
