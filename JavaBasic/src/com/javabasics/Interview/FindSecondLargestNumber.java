package Interview;

import java.util.Arrays;

public class FindSecondLargestNumber {
	public static void printSecondLargest(int arr[]){
		int size = arr.length;
		if(size < 2){
			System.out.println("Invalid Input");
			return;
		}
		
		Arrays.sort(arr);
		
		for(int i=size-2; i>=0; i--){
			if(arr[i] != arr[size-1]){
				System.out.println("The Second Largest element is : " + arr[i]);
			}
		}
	}

	// 1,4,5,34,35,35
	public static void main(String args[]) {
		int arr[] = { 1, 4, 5, 34, 35, 35 };
		printSecondLargest(arr);
	}
}
