package SubArrayAndTwoPointerAndSlidingWindow;

public class MinimumLengthSubarrayWithSumAtLeastTarget {

	public static void main(String[] args) {
		int[] arr = {2,3,1,2,4,3};
		int target = 7;
		
		int left = 0;
		int windowSum = 0;
		int minLength = Integer.MAX_VALUE;
		
		for(int right = 0; right < arr.length; right++) {
			windowSum += arr[right];
			
			while(windowSum >= target) {
				minLength = Math.min(minLength, right - left + 1);
				windowSum -= arr[left];
				left++;
			}
		}
		System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);

	}

}
