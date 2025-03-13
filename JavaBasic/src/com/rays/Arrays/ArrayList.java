package com.rays.Arrays;

import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		// Adding
		nums.add(2);
		nums.add(5);
		nums.add(8);

		// Retrieving
		System.out.println(nums.get(0));

		// Indexed for loop iteration
		for (int i = 0; i < nums.size(); i++) {
		    System.out.println(nums.get(i));
		}

		nums.remove(nums.size() - 1);
		nums.remove(0); // VERY slow

		for (Integer value : nums) {
		    System.out.println(value);
		}

	}

}
