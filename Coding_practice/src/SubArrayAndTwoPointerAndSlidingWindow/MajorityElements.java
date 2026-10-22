package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3};
// bruete force
        int n = arr.length;
        boolean found = false;
        System.out.print("MajorityElements : ");
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
        
        
        System.out.print("Map Majority : ");
        mapMajority(arr);
    }
    //Using Map 
    public static void mapMajority(int[] arr) {
    	int n = arr.length;
    	boolean found = false;
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int num : arr) {
    		map.put(num, map.getOrDefault(num, 0) + 1);
    		if(map.get(num) > n/2) {
    			found = true;
    			System.out.println(num);
    		}
    	}
    	if(!found) {
    		System.out.println(-1);
    	}
    	
    }
}