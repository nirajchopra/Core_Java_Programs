package com.rays.Arrays;

import java.util.List;
import java.util.ArrayList; // Add this import

public class ArrayListExample { 

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); 

        // Adding elements
        nums.add(2);
        nums.add(5);
        nums.add(8);

        // Retrieving the first element
        System.out.println("First element: " + nums.get(0));

        // Indexed for loop iteration
        System.out.println("Using for loop:");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // Removing elements
        nums.remove(nums.size() - 1); // Removes last element
        nums.remove(0); // Removes first element

        // Enhanced for loop
        System.out.println("After removal:");
        for (Integer value : nums) {
            System.out.println(value);
        }
    }
}
