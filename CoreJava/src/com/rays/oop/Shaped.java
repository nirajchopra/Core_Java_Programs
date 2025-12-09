package com.rays.oop;

public abstract class Shaped {
    public abstract double area();

    public void display() {
        System.out.println("This is Shape.");
    }
}

class Traingle extends Shaped {
    private double radius;
	private int length;

    public Traingle(int w, int length) {
        int width = w;
        this.length = length;
    }

    public double area() {
        double width = 0;
		return Math.PI*length*width;
    }
}
