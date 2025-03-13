package com.javabasics;


class Floating_Point_Literals {
	// float f1=11.22; -> it must be end with f/F.
	float f2 = 11.22f;
	float f3 = 11.33F;
	float f4 = Float.MAX_VALUE;
	float f5 = Float.MIN_VALUE;
	float f6;
	double d1 = 11.555;
	double d2 = 526.566D;
	double d3 = 11.333d;
	double d4 = Double.MAX_VALUE;
	double d5 = Double.MIN_VALUE;
	double d6 = 221.378D;
	double d7 = 99.99e+5;
	double d8 = 9.9E-5;

	void show() {
		System.out.println("show in Hai");
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
	}
}

class FloatingPointLiteral1 {
	public static void main(String[] args) {
		Floating_Point_Literals h1 = new Floating_Point_Literals();
		h1.show();
	}
}

            