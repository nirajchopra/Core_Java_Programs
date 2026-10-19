package ArrayBasics;

import java.util.Arrays;

public class DifferenceBetweenMaxAndMin {

	public static void main(String[] args) {
		int[] arr = { 3, 10, 1, 7 };
		System.out.print("DifferenceBetweenMaxAndMin : ");

		diffMaxAndMin(arr);

	}

	public static void diffMaxAndMin(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int n = arr.length;
		int temp  = arr[0];

		Arrays.sort(arr);

		max = arr[n - 1];
		min = arr[0];
		
		int diff = max - min;

		System.out.print(diff);
	}

}
