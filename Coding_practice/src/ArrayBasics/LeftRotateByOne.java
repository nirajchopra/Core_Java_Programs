package ArrayBasics;

import java.util.Arrays;

public class LeftRotateByOne {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; //[2,3,4,5,1]
		System.out.print("LeftRotateByOne : ");
		rotateOne(arr);

	}
	
	public static void rotateOne(int[] arr) {
		int n = arr.length;
		
		int temp = arr[0];
		
		for(int i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[n-1] = temp;
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
