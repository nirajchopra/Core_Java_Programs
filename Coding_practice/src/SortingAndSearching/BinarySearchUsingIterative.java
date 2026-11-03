package SortingAndSearching;

public class BinarySearchUsingIterative {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		int key = 7;

		System.out.println(binarySearch(arr, key));
	}

	public static int binarySearch(int[] arr, int key) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < key) {
				count++;
			}

		}
		return count;
	}

}
