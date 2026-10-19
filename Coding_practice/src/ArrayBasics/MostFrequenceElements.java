package ArrayBasics;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequenceElements {

	public static void main(String[] args) {
		int[] arr = {3,3,4,4,5,5,6,6};
		
		System.out.print("MostFrequenceElements : ");
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int maxFrequency = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency ||
                (frequency == maxFrequency && element < result)) {

                maxFrequency = frequency;
                result = element;
            }
        }
        System.out.print(result);
	}

}
