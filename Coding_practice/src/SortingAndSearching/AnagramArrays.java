package SortingAndSearching;

import java.util.Arrays;

public class AnagramArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 1, 2, 4, 5 };

		System.out.println(anagramArrays(arr1, arr2));

	}

	public static boolean anagramArrays(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

}
