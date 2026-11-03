package SortingAndSearching;

import java.util.Arrays;

public class SortStringsIgnoringCase {

	public static void main(String[] args) {
		String[] arr = { "banana", "Apple", "cherry" };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[i].compareToIgnoreCase(arr[j + 1]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
