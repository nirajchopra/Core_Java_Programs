package ArrayBasics;

public class CommonElementsOfTwoArrays {

	public static void main(String[] args) {
		int[] n1 = { 1, 2, 3, 4, 5 };
		int[] n2 = { 3, 4, 5 };
		System.out.print("CommonElementsOfTwoArrays : ");
		commonElements(n1, n2);
	}

	public static void commonElements(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
