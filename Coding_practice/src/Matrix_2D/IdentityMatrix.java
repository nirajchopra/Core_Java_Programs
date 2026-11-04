package Matrix_2D;

public class IdentityMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 0 }, { 0, 1 } };

		System.out.println("IdentityMatrix : " + identityMatrix(arr));
	}

	public static boolean identityMatrix(int[][] arr) {

		int rows = arr.length;
		int cols = arr[0].length;

		if (rows != cols) {
			return false;
		}

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (i == j && arr[i][j] != 1) {
					return false;
				}

				if (i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}

		return true;
	}
}