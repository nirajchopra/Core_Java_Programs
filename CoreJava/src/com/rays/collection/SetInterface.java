package com.rays.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {

        // ------------------- HashSet Example -------------------
        HashSet h = new HashSet(); // Creates HashSet (no order, no duplicates)

        // Adding elements (order will not be preserved)
        h.add(100);
        h.add(200);
        h.add(99);
        h.add(40);
        h.add(17);
        h.add(55);

        // 01 is treated as octal (base 8) → decimal 1
        System.out.println("contains 01 : " + h.contains(01)); // Checks if element '1' exists
        System.out.println("isEmpty : " + h.isEmpty()); // true if no elements
        System.out.println("size : " + h.size()); // Number of elements
        System.out.println("Remove : " + h.remove(01)); // Removes element '1' if exists
        System.out.println("HashSet : " + h); // Prints elements (unordered)
        System.out.println("hashCode : " + h.hashCode()); // Hash code of set

        System.out.println("--------------------------------");

        // ------------------- TreeSet Example -------------------
        TreeSet t = new TreeSet(); // Creates TreeSet (sorted order, no duplicates)

        // Adding elements (automatically sorted)
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);

        System.out.println("contains : " + t.contains(3)); // Checks if '3' exists
        System.out.println("ceiling : " + t.ceiling(3)); // Returns smallest element >= 3
        System.out.println("first : " + t.first()); // First (lowest) element
        System.out.println("pollFirst : " + t.pollFirst()); // Removes & returns first element
        System.out.println("TreeSet : " + t); // Prints sorted set
        System.out.println("size : " + t.size()); // Number of elements left
        System.out.println("pollLast : " + t.pollLast()); // Removes & returns last element
        System.out.println("TreeSet : " + t); // Prints after removing last element

        System.out.println("---------------------------");

        // ------------------- LinkedHashSet Example -------------------
        LinkedHashSet l = new LinkedHashSet(); // Maintains insertion order

        // Adding elements (order will be preserved)
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println("contains : " + l.contains(2)); // Checks if '2' exists
        System.out.println("isEmpty : " + l.isEmpty()); // true if empty
        System.out.println("size : " + l.size()); // Number of elements
        System.out.println("remove : " + l.remove(4)); // Removes element '4'
        System.out.println("LinkedHashSet : " + l); // Prints in insertion order
        System.out.println("hashCode : " + l.hashCode()); // Hash code of set
        System.out.println("ToArray : " + l.toArray()); // Converts to array (shows memory ref)

    }
}
