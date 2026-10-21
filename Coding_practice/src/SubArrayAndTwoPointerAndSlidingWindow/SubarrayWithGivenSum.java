package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.Arrays;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int target = 33;
		System.out.print("SubarrayWithGivenSum : ");
		subarrayGivenSum(arr, target);

	}

	public static void subarrayGivenSum(int[] arr, int target) {
		int left = 0;
		int windowSum = 0;

		for (int right = 0; right < arr.length; right++) {
			windowSum += arr[right];

			while (windowSum > target) {
				windowSum -= arr[left];
				left++;
			}
			
			while(windowSum == target) {
				System.out.println(left + " " + right);
				return;
			}
		}

		System.out.println(-1);

	}

}
