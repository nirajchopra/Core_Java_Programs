package ArrayBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3};
		System.out.print("Remove Duplicate From Sorted Array : ");
		removeDuplicate(arr);
	}
	
	public static void removeDuplicate(int[] arr) {
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != arr[index]) {
				index++;
				arr[index] = arr[i];
			}
		}
		
		System.out.print(index + 1 + " -> ");
		System.out.print(Arrays.toString(Arrays.copyOf(arr, index + 1)));
	}

}
