package ArrayBasics;

import java.util.Arrays;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,5,5,6,6};
		System.out.print("FindDuplicateElements : ");
		findDuplicate(arr);
	}
	
	public static void findDuplicate(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				System.out.print(arr[i] + " ");
			}
			
		}
	}

}
