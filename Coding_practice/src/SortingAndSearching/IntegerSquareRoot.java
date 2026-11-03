package SortingAndSearching;

public class IntegerSquareRoot {

	public static void main(String[] args) {
		int a = 16;
		
		System.out.println("IntegerSquareRoot : " + integerSquareRoot(a));

	}

	public static int integerSquareRoot(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int low = 1;
		int high = n;
		int ans = 0;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (mid <= n / mid) {

				ans = mid;
				low = mid + 1;

			} else {

				high = mid - 1;
			}
		}

		return ans;
	}

}
