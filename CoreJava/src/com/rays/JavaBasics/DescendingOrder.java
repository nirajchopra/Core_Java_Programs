package com.rays.JavaBasics;

public class DescendingOrder {
	public static void main(String args[]) {
		int arr[] = { 10, 50, 80, 40, 5 };
		int num = 80;

		int temp = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				temp = i;
				break;
			}

		}
		System.out.println(temp);
	}

}
