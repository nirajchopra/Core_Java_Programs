package ArrayBasics;

import java.util.Arrays;

public class RotateArrayByK {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.print("RotateArrayByK : ");
		rotateByK(arr, k);

	}
	
	static void rotateByK(int[] arr, int k) {
		int n = arr.length;
		k = k % n;

		for (int j = 0; j < k; j++) {
		    int temp = arr[n - 1];

		    for (int i = n - 1; i > 0; i--) {
		        arr[i] = arr[i - 1];
		    }

		    arr[0] = temp;
		}
		System.out.print(Arrays.toString(arr));
	}

}
