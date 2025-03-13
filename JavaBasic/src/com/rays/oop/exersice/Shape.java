package com.rays.oop.exersice;

public abstract class Shape {
    private double area;

    public abstract void calculateArea();

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }
}