package coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsInArray {
	
	public static void main(String[] args) {
		
		String[] names = {"Java", "HTML", "SQL", "Javascript", "Java", "Ruby", "HTML", "SQL"};
		
		//1. Compares each elements -- Time Complexity - O(n^2) -- worst Solution
		
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate Elements using Comapre each Elements : " + names[i]);
				}
			}
		}
		
		
		System.out.println("*********************************************");
		
		
		//2. Using HashSet : Java Collection : It stores unique values
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name) == false) {
				System.out.println("Duplicate Elements Using HashSet : " + name);
			}
		}
		
		System.out.println("*********************************************");
		
		//3. Using HasMap :
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : names) {
			Integer count = storeMap.get(name);
			
			if(count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}
		
		//get the value from this map
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate elements using HashMap : " + entry.getKey());
			}
		}
	}

}
