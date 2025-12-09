package com.rays.oop;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        // Set shape details
        shape.setColor("Red");
        shape.setBorderWidth(2);
        
        // Get and print shape details
        System.out.println("Color: " + shape.getColor());
        System.out.println("Border Width: " + shape.getBorderWidth());
    }
}
