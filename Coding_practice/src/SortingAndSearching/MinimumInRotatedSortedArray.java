package SortingAndSearching;

public class MinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		
		System.out.println("MinimumInRotatedSortedArray : " + rotatedSortedArray(arr));

	}
	
	public static int rotatedSortedArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] > arr[end]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return arr[start];
	}

}
