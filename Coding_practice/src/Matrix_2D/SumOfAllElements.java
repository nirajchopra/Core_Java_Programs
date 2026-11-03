package Matrix_2D;

public class SumOfAllElements {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 } };
		System.out.println("Sum of All Elements : " + sumOfAllElements(arr));
	}

	public static int sumOfAllElements(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

}
