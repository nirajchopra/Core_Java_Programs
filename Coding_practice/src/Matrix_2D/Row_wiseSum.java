package Matrix_2D;

import java.util.Arrays;

public class Row_wiseSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.print("Row-wise Sum : ");
		row_wiseSum(arr);

	}

	public static void row_wiseSum(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;

		for (int i = 0; i < row; i++) {

			int sum = 0;

			for (int j = 0; j < col; j++) {

				sum = sum + arr[i][j];

			}
			System.out.print(sum + " ");

		}

	}

}
