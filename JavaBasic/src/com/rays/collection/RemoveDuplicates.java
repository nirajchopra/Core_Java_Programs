package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        Set<Integer> uniqueSet = new HashSet<>(list);
        List<Integer> listWithoutDuplicates = new ArrayList<>(uniqueSet);

        System.out.println("Original List: " + list);
        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
    }
}
