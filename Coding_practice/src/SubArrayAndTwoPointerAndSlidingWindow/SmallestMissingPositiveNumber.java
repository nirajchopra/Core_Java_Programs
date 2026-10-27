package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestMissingPositiveNumber {

	public static void main(String[] args) {
		int[] arr = { 3, 4, -1, 1 };

		System.out.println("SmallestMissingPositiveNumber : " + missingPositiveNumber(arr));

	}

	public static int missingPositiveNumber(int[] arr) {
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		int smallest = 1;

		while (set.contains(smallest)) {
			smallest++;
		}

		return smallest;
	}

}
