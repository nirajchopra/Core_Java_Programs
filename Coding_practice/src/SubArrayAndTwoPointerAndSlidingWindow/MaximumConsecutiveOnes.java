package SubArrayAndTwoPointerAndSlidingWindow;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 };

		int currentCount = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				currentCount++;
			} else if (arr[i] == 0) {
				currentCount = 0;
			}

			if (currentCount > maxCount) {
				maxCount = currentCount;
			}
		}
		System.out.println("MaximumConsecutiveOnes : " + maxCount);

	}

}
