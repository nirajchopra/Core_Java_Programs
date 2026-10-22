package SubArrayAndTwoPointerAndSlidingWindow;

public class CountPeaks {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 1 };

		int count = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				count++;
			}
		}
		System.out.println("CountPeaks : " + count);

	}

}
