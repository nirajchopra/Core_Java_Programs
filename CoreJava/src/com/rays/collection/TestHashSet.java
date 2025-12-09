package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {

        // HashSet ka object banaya (Set interface ka implementation)
        // Set => No duplicate, unordered collection
        Set s1 = new HashSet(); // Non-generic, isme mixed data type store ho sakte hain

        // Elements add kiye
        s1.add(1);         // Integer 1 add kiya
        s1.add("one");     // String "one" add kiya
        s1.add(1);         // Duplicate 1 (ignore ho jaayega)
        s1.add(null);      // null value add ki
        s1.add(null);      // Duplicate null (ignore ho jaayega)

        // Set print kiya (unordered & no duplicates)
        System.out.println("set => " + s1); 
    }
}
