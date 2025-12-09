package com.rays.JavaBasics;

public class TwoDimensional {
	public static void main(String args[]) {
		int row = 9;
		int col = 10;
		int[][] arr = new int[9][10];
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				arr[i][j] = (j + 1) * (i + 2);
			}

		}
		System.out.println(" array is ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
