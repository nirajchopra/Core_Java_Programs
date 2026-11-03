package SortingAndSearching;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int target = 5;

		System.out.println("SearchInsertPosition : " + searchInsertPosition(arr, target));
		System.out.println("insertPostion : " + insertPostion(arr, target));

	}

	// Using Bruteforce
	public static int insertPostion(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= target) {
				return i;
			}
		}

		return arr.length;
	}

	// Using Binary Search
	public static int searchInsertPosition(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			else if (arr[mid] < target) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}
		}

		return start;
	}

}
