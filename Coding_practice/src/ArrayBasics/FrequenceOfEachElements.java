package ArrayBasics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenceOfEachElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 1, 1 };
		
		System.out.print("FrequenceOfEachElements : ");

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
		}
	}

}
