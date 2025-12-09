package com.rays.JavaBasics;

public class SwitchDivide {
	public static void main(String args[]) {
		int a = 6;
		int b = 2;
		int divide = a / b;
		switch (divide) {
			case 4:
				System.out.println("a=4");
				break;
			case 2:
				System.out.println("b=2");
				break;
			case 3:
				System.out.println("Divide=3");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}

}
