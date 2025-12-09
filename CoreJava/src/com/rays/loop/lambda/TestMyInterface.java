package com.rays.loop.lambda;

public class TestMyInterface {
	 public static void main(String[] args) {
	     // Using lambda expression to create an instance of MyInterface
	     MyInterface square = (int x) -> x * x;
	     
	     // Calling the method defined by the lambda expression
	     System.out.println(square.operate(111)); // Output: 25
	 }
}
