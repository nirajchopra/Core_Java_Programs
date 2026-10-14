package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {

		int[] arr = { 3, 9, 2, 7, 17 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				min = max;
				max = arr[i];
			}
		}

		System.out.println("Maximum Element : " + max);

	}

}
