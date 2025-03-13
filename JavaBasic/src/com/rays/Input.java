package com.rays;

import java.util.Scanner;

public class Input {
	public static void main(String args[]) {
		try (//Input
		Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
//		int sum = a + b;
//		System.out.println("number: "+sum);
//		int sub = a-b;
//		System.out.println("Number: "+sub);
//		int mul=a*b;
//		System.out.println("Number: "+mul);
			int div = a/b;
			System.out.println("Number: "+div);
		}

	}

}
