package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.Arrays;

public class PrefixSumArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int n = arr.length;
		
		int[] prefix = new int[n + 1];
		
		for(int i=0; i<n; i++) {
			prefix[i+1] = prefix[i] + arr[i];
		}
		
		System.out.println("PrefixSumArray : " + Arrays.toString(prefix));

	}

}
