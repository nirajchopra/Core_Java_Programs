package Matrix_2D;

public class RowWithMaximumSum {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 5, 6 }, { 3, 0 } };

		System.out.println("Row With Maximum Sum: " + rowWithMaximumSum(arr));
	}

	public static int rowWithMaximumSum(int[][] arr) {

		int maxSum = Integer.MIN_VALUE;
		int maxRow = -1;

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];
			}

			if (sum > maxSum) {

				maxSum = sum;
				maxRow = i;
			}
		}

		return maxRow;
	}
}