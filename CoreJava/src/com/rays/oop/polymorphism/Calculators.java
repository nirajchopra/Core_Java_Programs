package com.rays.oop.polymorphism;

public class Calculators {
	public static void main(String[] args) {
		Caculators cal = new Caculators();
		System.out.println(cal.sum(10, 2));
		System.out.println(cal.sum(10.0f, 2.0f));
		System.out.println(cal.sum(10, 22, 23));
	}

}

class Caculators {
	int sum(int a, int b) {
		return a+b;
	}
	
	float sum(float a, float b) {
		return a+b;
	}
	
	int sum(int a,int b, int c ) {
		return a+b+c;
	}
}