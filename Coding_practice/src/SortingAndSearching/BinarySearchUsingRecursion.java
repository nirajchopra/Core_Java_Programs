package SortingAndSearching;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9 };
		int key = 1;

		System.out.println(binarySearch(arr, key, 0, arr.length - 1));
	}

	public static int binarySearch(int[] arr, int key, int low, int high) {

		// Base condition
		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		// Element found
		if (arr[mid] == key) {
			return mid;
		}

		// Search right half
		if (arr[mid] < key) {
			return binarySearch(arr, key, mid + 1, high);
		}

		// Search left half
		return binarySearch(arr, key, low, mid - 1);
	}
}