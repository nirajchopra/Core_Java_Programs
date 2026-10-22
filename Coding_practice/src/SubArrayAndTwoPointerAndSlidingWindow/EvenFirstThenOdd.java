package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.Arrays;

public class EvenFirstThenOdd {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4};
		
		int[] result = new int[arr.length];
		int index = 0;
		
		for(int num : arr) {
			if(num % 2 == 0) {
				result[index] = num;
				index++;
			}
		}
		
		for(int num : arr) {
			if(num % 2 != 0) {
				result[index] = num;
				index++;
			}
		}
		System.out.println("EvenFirstThenOdd : " + Arrays.toString(result));

	}

}
