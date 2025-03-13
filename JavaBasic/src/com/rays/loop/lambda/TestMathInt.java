package com.rays.loop.lambda;



public class TestMathInt {
    public static void main(String[] args) {
        MathInt math = new MathInt() {

			@Override
			public int calculate(int a, int b) {
				
				return 0;
			}};

        int a = 10;
        int b = 5;

        System.out.println("Add: " + math.add.calculate(a, b));
        System.out.println("Multiply: " + math.multiply.calculate(a, b));
        System.out.println("Subtract: " + math.subtract.calculate(a, b));
        System.out.println("Divide: " + math.divide.calculate(a, b));
    }
}
