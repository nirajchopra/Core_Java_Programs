package ArrayBasics;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 }, arr2 = { 2, 4, 6, 8 };
		System.out.print("MergeTwoSortedArray : ");
		mergeArray(arr1, arr2);
	}

	public static void mergeArray(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int newArr = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				result[newArr] = arr1[i];
				i++;
			} else {
				result[newArr] = arr2[j];
				j++;
			}

			newArr++;
		}

		while (i < arr1.length) {
			result[newArr] = arr1[i];
			i++;
			newArr++;
		}

		while (j < arr2.length) {
			result[newArr] = arr2[j];
			j++;
			newArr++;
		}

		System.out.println(Arrays.toString(result));

	}

}
