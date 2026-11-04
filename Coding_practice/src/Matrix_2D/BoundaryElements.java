package Matrix_2D;

public class BoundaryElements {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.print("BoundaryElements : ");
		boundary(arr);
	}

	public static void boundary(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;

		// first row
		for (int j = 0; j < cols; j++) {
			System.out.print(arr[0][j] + " ");
		}

		// first column
		for (int i = 1; i < rows; i++) {
			System.out.print(arr[i][cols - 1] + " ");
		}

		// Last row
		if (rows > 1) {
			for (int j = cols - 2; j >= 0; j--) {
				System.out.print(arr[rows - 1][j] + " ");
			}
		}
		// first column
		if (cols > 1) {
			for (int i = rows - 2; i > 0; i--) {
				System.out.print(arr[i][0] + " ");
			}
		}
	}

}
