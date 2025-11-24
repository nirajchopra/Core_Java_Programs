package Interview;

import java.util.HashMap;
import java.util.Map;
//finding pairs of numbers in the array whose sum is 20.
public class Arrays2 {
	public static void main(String args[]) {
		int[] arr = new int[] { 1, 12, 8, 19, 11, 9, 7, 5, 15, 5, 8 };

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int targetSum = arr[i] + arr[j];
				if (targetSum == 20) {
					map.put(arr[i], arr[j]);
				}
			}
		}
		System.out.println(map);
	}
}
