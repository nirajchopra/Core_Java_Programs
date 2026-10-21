package SubArrayAndTwoPointerAndSlidingWindow;

public class LongestIncreasingContiguousSubarray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 4, 7 };

		System.out.println("LongestIncreasingContiguousSubarray : " + longestIncreasingSubarray(arr));
	}

	public static int longestIncreasingSubarray(int[] arr) {

		if (arr.length == 0) {
			return 0;
		}

		int currentLength = 1;
		int maxLength = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1]) {
				currentLength++;
			} else {
				currentLength = 1;
			}

			maxLength = Math.max(maxLength, currentLength);
		}

		return maxLength;
	}
}