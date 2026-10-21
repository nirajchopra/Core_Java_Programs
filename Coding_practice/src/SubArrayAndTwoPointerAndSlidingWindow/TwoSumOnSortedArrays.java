package SubArrayAndTwoPointerAndSlidingWindow;

public class TwoSumOnSortedArrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 11, 15 };
		int target = 9;
		
		System.out.println("TwoSumOnSortedArrays : ");

		twoSumOnSortedArray(arr, target);

	}

	public static void twoSumOnSortedArray(int[] arr, int target) {
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {

				if (arr[start] + arr[end] == target) {
					System.out.println(start + " " + end);
					return;
				}
			}
		}
		System.out.println(-1);

	}

}
