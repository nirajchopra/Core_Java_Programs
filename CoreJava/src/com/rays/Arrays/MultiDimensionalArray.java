package com.rays.Arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] matrix = { {1, 2, 3}, {4, 5} };

		int x = matrix[1][0];  // 4
		// [[1, 2, 3], [4, 5]]
		Arrays.deepToString(matrix);

		for (int i = 0; i < matrix.length; ++i) {
		  for(int j = 0; j < matrix[i].length; ++j) {
		    System.out.println(matrix[i][j]);
		  }
		}
	}

}
