package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class NearbyDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		int k = 3;

		System.out.println("NearbyDuplicate : " + nearbyDuplicate(arr, k));

	}

	public static boolean nearbyDuplicate(int[] arr, int k) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				return true;
			}
			set.add(arr[i]);

			if (set.size() > k) {
				set.remove(arr[i]);
			}
		}
		return false;

	}

}
