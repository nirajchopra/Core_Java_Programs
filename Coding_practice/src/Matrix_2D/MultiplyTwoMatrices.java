package Matrix_2D;

import java.util.Arrays;

public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		int[][] arr2 = { { 5, 6 }, { 7, 8 } };

		System.out.print("MultiplyTwoMatrices : ");
		multipleTwoMatrices(arr1, arr2);
	}

	public static void multipleTwoMatrices(int[][] arr1, int[][] arr2) {
		int rows = arr1.length;
		int cols = arr2[0].length;

		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < arr2.length; k++) {

					result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}

		}
		System.out.println(Arrays.deepToString(result));
	}

}
