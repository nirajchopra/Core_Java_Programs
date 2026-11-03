package SortingAndSearching;

public class CountOccurrencesInSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 3 };
		int key = 2;
		System.out.println("CountOccurrencesInSortedArray : " + countOccurrencesInSortedArray(arr, key));

	}

	public static int countOccurrencesInSortedArray(int[] arr, int key) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count++;
			}
		}
		return count;
	}

}
