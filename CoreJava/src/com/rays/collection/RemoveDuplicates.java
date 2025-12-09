package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // List banayi aur duplicate values add ki
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);  // duplicate
        list.add(2);
        list.add(2);  // duplicate
        list.add(3);
        list.add(4);

        // Step 1: HashSet banaya (ye duplicate values ko automatically hata deta hai)
        Set<Integer> uniqueSet = new HashSet<>(list);

        // Step 2: Set ko phir se List me convert kiya
        List<Integer> listWithoutDuplicates = new ArrayList<>(uniqueSet);

        // Original list print ki (jisme duplicate values hain)
        System.out.println("Original List: " + list);
        
        // Duplicates remove hone ke baad new list print ki
        System.out.println("List after removing duplicates: " + uniqueSet);

        // Duplicates remove hone ke baad new list print ki
        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
    }
}
