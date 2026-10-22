package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {

	public static void main(String[] args) {
		int[] arr = {1,4,3,8,5};
		
		List<Integer> peaks = new ArrayList<Integer>();
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				peaks.add(i);
			}
		}
		System.out.println("FindThePeaks : " + peaks);

	}

}
