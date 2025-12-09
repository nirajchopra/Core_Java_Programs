package com.rays.oop;

public class TestCircle {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setColor("Red");
		
		c.setRadius(5);
		
		System.out.println(c.getRadius());
		System.out.println(c.getBordorWidth());
		System.out.println(c.getColor());
		System.out.println(c.area());
	}

}
