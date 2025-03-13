package com.rays;

public class SwitchSum {
	public static void main(String args[]) {
		int a = 5;
		int b = 6;
		int sum = a + b;
		switch (sum) {
		case 5:
			System.out.println("a=5");
			break;
		case 6:
			System.out.println("b=6");
			break;
		case 11:
			System.out.println("sum=11");
			break;
			default:
				System.out.println("Error");
				break;
		}
	}

}
