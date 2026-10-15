package ArrayBasics;

public class PositiveNegativeAndZeroCount {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 0, 3, -4, 0 };
		System.out.println("PositiveNegativeAndZeroCount : ");
		pnzCount(arr);

	}

	public static void pnzCount(int[] arr) {
		int positive = 0;
		int zero = 0;
		int negative = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero++;
			} else if (arr[i] > 0) {
				positive++;
			} else {
				negative++;
			}
		}
		System.out.print(" Zero : " + zero);
		System.out.print(" Positive : " + positive);
		System.out.print(" Negative : " + negative);
	}

}
