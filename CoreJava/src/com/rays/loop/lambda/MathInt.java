package com.rays.loop.lambda;

public interface MathInt {
	
	public int calculate (int a, int b);
	
	
//	MathInt add = (a, b) -> a + b;
//	MathInt multiply = (a, b) -> a * b;
//	MathInt subtract = (a, b) -> a - b;
//	MathInt divide = (a, b) -> a / b;
	
	
	MathInt add = (a,b) -> {
		return a+b;
	};

	MathInt multiply = (a,b) -> {
		return a*b;
	};

	MathInt subtract = (a,b) -> {
		return a-b;
	};

	MathInt divide = (a,b) -> {
		return a/b;
	};

}