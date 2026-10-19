package ArrayBasics;

public class MissingNumberFromOneToN {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		System.out.print("Missing Number From One To N : ");
		missingNumber(arr);
	}
	
	public static void missingNumber(int[] arr) {
		int sum = 0;
		int n = arr.length;
		int missing = 0;
		for(int i=0; i<n - 1; i++) {
			sum += arr[i];
			
			missing = n * (n + 1) / 2;
			missing -= sum;
			
			
		}
		System.out.print(missing);
	}

}
