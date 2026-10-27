package SortingAndSearching;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 2, 8 };
		int n = arr.length;
		// first Way

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}

		System.out.print("Sorted Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		// Second way
		int temp = 0;
		System.out.print("Bubble sort : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.print(arr[i] + " ");

		}

	}

}
