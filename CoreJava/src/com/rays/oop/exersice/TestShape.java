package com.rays.oop.exersice;

import com.rays.oop.methodreturn.Rectangle;
import com.rays.oop.methodreturn.Shape;

public class TestShape {

    public static void main(String[] args) {

        Shape[] s = new Shape[3];

        s[0] = Shape.getShape(1);
        s[1] = Shape.getShape(2);
        s[2] = Shape.getShape(3);

        Rectangle r = (Rectangle) s[0];
        r.setLength(50);

        double totalArea = 0;

        for (Shape shape : s) {
            shape.calculateArea();
            totalArea += shape.area();
        }

        System.out.println("Total Area: " + totalArea);
    }
}

