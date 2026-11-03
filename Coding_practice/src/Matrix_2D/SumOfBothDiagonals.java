package Matrix_2D;

public class SumOfBothDiagonals {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Sum of Both Diagonal : " + sumOfBothDiagonal(arr));
	}

	public static int sumOfBothDiagonal(int[][] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i][i];

			if (i != n - 1 - i) {
				sum += arr[i][n - 1 - i];
			}
		}

		return sum;
	}

}
