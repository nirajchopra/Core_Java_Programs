package com.rays;

public class BubbleSort {
	public static void main(String args[]) {
		int[] a = { 12, 6, 76, 5, 20, 8 };
		int temp = 0;
		System.out.print("Bubble sort : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.print(a[i] + " ");

		}
	}
}
