package ArrayBasics;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 2, 8 , 8};
		int key = 8;
		
		System.out.println("LinearSearch : " + liner(arr, key));

	}
	
	public static int liner(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
			
		}
		return -1;
	}

}
