package SortingAndSearching;

public class SortInDescendingOrder {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 1, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int j = 0;

			while (j < arr.length - 1 - i) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				j++;
			}

		}

		System.out.print("SortInDescendingOrder : ");
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
