package SortingAndSearching;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15, 5 };
		int k = 3;
		int KSmallest = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			if (i == k) {
				KSmallest++;
				System.out.println(arr[i - 1]);
			}

		}
		System.out.println(Arrays.toString(arr));

	}

}
