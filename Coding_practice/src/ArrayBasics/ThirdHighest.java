package ArrayBasics;

import java.util.Arrays;

public class ThirdHighest {

	public static void main(String[] args) {
		int[] nums = { 7, 3, 5, 12, 4, 6 };
		int n = nums.length;
		int count = 1;
		int max = nums[n - 1];

		int secondMax = 0;
		int thirdMax = 0;

		for (int i = n - 2; i >= 0; i--) {

			if (nums[i] != nums[i + 1]) {
				count++;

				if (count == 2) {
					secondMax = nums[i];
				}

				if (count == 3) {
					thirdMax = nums[i];
					System.out.println(thirdMax);
				}
			}
		}

		System.out.println(max);

	}

}
