package ArrayBasics;

public class ElementsAtEvenIndexes {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.print("ElementsAtEvenIndexes : ");
		evenIndex(arr);
	}

	public static void evenIndex(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
