package Matrix_2D;

public class SearchInAMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		int key = 3;

		int[] result = searchInMatrix(arr, key);

		if (result[0] == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("(" + result[0] + "," + result[1] + ")");
		}
	}

	public static int[] searchInMatrix(int[][] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[] { -1, -1 };
	}
}