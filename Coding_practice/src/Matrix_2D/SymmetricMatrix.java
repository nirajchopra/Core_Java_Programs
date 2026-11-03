package Matrix_2D;

public class SymmetricMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 4, 3 } };

		System.out.println("Symmetric Matrix: " + symmetricMatrix(arr));
	}

	public static boolean symmetricMatrix(int[][] arr) {

		if (arr.length != arr[0].length) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] != arr[j][i]) {
					return false;
				}
			}
		}

		return true;
	}
}