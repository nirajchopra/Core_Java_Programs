package ArrayBasics;

import java.util.Arrays;

public class ThirdHighest {

	public static void main(String[] args) {
		int[] arr = {7,3,5,12,4,6};
		
		int max = 0;
		int secondMax = 0;
		int thirdMax = 0;
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			}
			
			if(secondMax < arr[i] && max > arr[i]) {
				secondMax = arr[i];
				
				if(secondMax > thirdMax) {
					thirdMax = arr[i];
				}
				
			}
			
		}
		
		System.out.println("Thhird Highest : " + thirdMax);

	}

}
