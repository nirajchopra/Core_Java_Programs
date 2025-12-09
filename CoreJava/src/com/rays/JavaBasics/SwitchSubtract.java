package com.rays.JavaBasics;

public class SwitchSubtract {
	public static void main(String args[]) {
		int a = 5;
		int b = 2;
		int sub = a - b;
		switch (sub) {
			case 5:
				System.out.println("a=5");
				break;
			case 2:
				System.out.println("b=2");
				break;
			case 3:
				System.out.println("Subtract=3");
				break;
			default:
				System.out.println("Error");
		}
	}

}
