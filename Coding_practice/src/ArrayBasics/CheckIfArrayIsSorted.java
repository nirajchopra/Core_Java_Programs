package ArrayBasics;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,6,5};
		
		 int count = 0;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i] < nums[i-1]){
	                count++;
	            }
	        }
	        if(nums[nums.length - 1] > nums[0]){
	            count++;
	        }
	        System.out.println(count <= 1);
		
	}

}
