package ArrayBasics;

public class MinimumElement {
	public static void main(String[] args) {
		int[] arr = { -5, -2, -9, -13, 9, 2, 7 };
		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				max = min;
				min = arr[i];
			}
		}
		System.out.println("Minimum Element : " + min);
	}

}
