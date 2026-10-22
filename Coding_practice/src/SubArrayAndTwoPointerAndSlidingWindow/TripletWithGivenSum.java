package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.Arrays;

public class TripletWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int sum = 6;
		
		System.out.println(triple(arr, sum));
		
	}
	
	public static boolean triple(int[] arr, int target) {
		Arrays.sort(arr);
		int fixed = 1;
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int tripleSum = arr[fixed] + arr[left] + arr[right];
			if(tripleSum == target) {
				return true;
			} else if(tripleSum < target ) {
				left++;
			} else if (tripleSum > target) {
				right--;
			} 
			
		}
		return false;
		
	}

}
