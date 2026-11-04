package Matrix_2D;

import java.util.Arrays;

public class RotateMatrix90DegreesClockwise {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(arr);
	}

	public static void rotate(int[][] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = n - 1;

			while (left <= right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;

				left++;
				right--;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
