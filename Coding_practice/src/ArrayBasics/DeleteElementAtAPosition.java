package ArrayBasics;

import java.util.Arrays;

public class DeleteElementAtAPosition {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int pos = 1;

		int[] arr = new int[a.length - 1];

		for (int i = 0; i < pos; i++) {
			arr[i] = a[i];
		}

		for (int i = pos + 1; i < a.length; i++) {
			arr[i - 1] = a[i];
		}

		System.out.println("DeleteElementAtAPosition : " + Arrays.toString(arr));

	}

}
