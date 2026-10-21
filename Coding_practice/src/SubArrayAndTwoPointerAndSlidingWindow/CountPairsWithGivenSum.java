package SubArrayAndTwoPointerAndSlidingWindow;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {1,5,7,-1,5};
		int sum = 6;
		int count = 0;
		
		for(int start=0; start<arr.length; start++) {
			for(int end=start; end<arr.length; end++) {
				if(arr[start] + arr[end] == sum) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
