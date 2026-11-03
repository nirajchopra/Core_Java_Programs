package Matrix_2D;

import java.util.Arrays;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		int[][] arr2 = { { 5, 6 }, { 7, 8 } };
		// Out: [[6,8],[10,12]]
		System.out.print("Add two Matrices : ");
		addTwoMatrix(arr1, arr2);

	}

	public static void addTwoMatrix(int[][] arr1, int[][] arr2) {
		 int rows = arr1.length;
		    int cols = arr1[0].length;

		    int[][] result = new int[rows][cols];

		    for (int i = 0; i < rows; i++) {

		        for (int j = 0; j < cols; j++) {

		            result[i][j] = arr1[i][j] + arr2[i][j];
		        }
		    }

		    System.out.println(Arrays.deepToString(result));
	}

}
