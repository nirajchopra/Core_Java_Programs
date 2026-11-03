package Matrix_2D;

import java.util.Arrays;

public class TransposeOfAMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.print("Transpose of Matrix : ");
		transposeOfMatrix(arr);
	}

	public static void transposeOfMatrix(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;

		int[][] transpose = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		System.out.println(Arrays.deepToString(transpose));
	}

}
