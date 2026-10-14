package ArrayBasics;

public class SecondLargestElement {
	public static void main(String[] args) {

		int[] arr = { 3, 9, 2, 7, 10 };
		int max = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secondLargest = max;
				max = arr[i];
			}

			if (secondLargest < arr[i] && max > arr[i]) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second largest : " + secondLargest);

	}

}
