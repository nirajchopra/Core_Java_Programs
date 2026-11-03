package Matrix_2D;

public class LargestElementAndItsPosition {

	public static void main(String[] args) {

		int[][] arr = { { 3, 8 }, { 9, 1 } };

		largestElementAndItsPosition(arr);
	}

	public static void largestElementAndItsPosition(int[][] arr) {

		int largest = arr[0][0];

		int row = 0;
		int col = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > largest) {

					largest = arr[i][j];

					row = i;
					col = j;
				}
			}
		}

		System.out.println("Largest Element: " + largest);
		System.out.println("Position: (" + row + "," + col + ")");
	}
}