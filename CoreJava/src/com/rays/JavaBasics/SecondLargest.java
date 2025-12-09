package com.rays.JavaBasics;

public class SecondLargest {
	public static void main(String args[]) {
		int[] num = { 1, 2, 3, 4, 5 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < num.length; i++) {

			if (max < num[i]) {
				min = max;
				max = num[i];
			}

			if (min < num[i] && max > num[i]) {

				min = num[i];

			}

		}
		System.out.println("secound largest : " + min);

	}

}
