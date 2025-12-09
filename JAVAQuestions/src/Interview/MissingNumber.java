package Interview;

public class MissingNumber {
	public static void main(String args[]) {
		
		int arr[] = new int[] {1,2,3,4,57,8,9,10};
		int sum = (10*11)/2;
		int actualSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			actualSum = actualSum + arr[i];
				
		}
		System.out.println("Missing Number is : " + (sum - actualSum));
	}

}
