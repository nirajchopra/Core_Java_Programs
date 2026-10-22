package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.Arrays;

public class Sort0s1sAnd2s {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 1, 2, 0, 1 };

		int low = 0;
		int mid = 0;
		int high = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
