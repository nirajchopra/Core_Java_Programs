package Interview;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArrayUsingSet {
	public static void main(String args[]){
		int[] inputNumArray = {10,5,10,34,24,90,24,70,100,102,100};
		
		Set<Integer> dupNumberSet = new HashSet<>();
		for(Integer number : inputNumArray){
			if(!dupNumberSet.add(number)){
				System.out.println("Duplicate Element found : " + number);
			}
		}
	}
}
