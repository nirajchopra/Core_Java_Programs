package SubArrayAndTwoPointerAndSlidingWindow;

public class RemoveElementInPlace {

	public static void main(String[] args) {
		int[] arr = {3,2,2,3,1};
		int val = 3;
		
		int slow = 0;
		
		for(int fast = 0; fast < arr.length; fast++) {
			if(arr[fast] != val) {
				arr[slow] = arr[fast];
				slow++;
			}
		}
		System.out.println("RemoveElementInPlace : " + slow);

	}

}
