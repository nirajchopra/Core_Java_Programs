package com.rays;

public class SwitchMultiply {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int mul = a*b;
		switch (mul) {
		case 1:
			System.out.println("a=4");
			break;
		case 2:
			System.out.println("b=5");
			break;
		case 20:
			System.out.println("Multiply=20");
			break;
			default:
				System.out.println("Error");
				break;
		}
	}

}
