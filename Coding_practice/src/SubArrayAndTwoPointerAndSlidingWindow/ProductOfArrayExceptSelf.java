package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4 };
		int[] arr = { 2, 3};
		productExceptSelf(arr);
		
	}
	
	public static void productExceptSelf(int[] arr) {
	    int n = arr.length;
	    int[] result = new int[n];

	    // Step 1: Store prefix products
	    result[0] = 1;

	    for (int i = 1; i < n; i++) {
	        result[i] = result[i - 1] * arr[i - 1];
	    }

	    // Step 2: Multiply by suffix products
	    int suffix = 1;

	    for (int i = n - 1; i >= 0; i--) {
	        result[i] = result[i] * suffix;
	        suffix = suffix * arr[i];
	    }

	    System.out.println(Arrays.toString(result));
	}

}
