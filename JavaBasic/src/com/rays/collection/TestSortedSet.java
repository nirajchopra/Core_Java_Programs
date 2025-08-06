package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

    public static void main(String[] args) {

        // TreeSet banaya jo sorted order me elements store karta hai
        SortedSet<String> s = new TreeSet<>();

        // Elements add kiye
        s.add("one");
        s.add("two");
        s.add("three");

        // Sorted set ke elements print kiye (alphabetical order me aayenge)
        System.out.println("Sorted Elements:");
        for (String value : s) {
            System.out.println(value);
        }

        // Sabse pehla (minimum) element print kiya
        System.out.println("First Element: " + s.first());

        // Sabse last (maximum) element print kiya
        System.out.println("Last Element: " + s.last());
    }
}
