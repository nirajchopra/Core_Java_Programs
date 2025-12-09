package com.rays.collection;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
       
        // Ek Vector object banaya jisme String values store karenge
        Vector<String> vector = new Vector<>();

        // Vector me elements add kiye
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Vector ka size print kiya (kitne elements hai)
        System.out.println("Vector size: " + vector.size());

        // Vector ke sabhi elements loop karke print kiye
        System.out.println("Elements in Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Index 1 ka element print kiya (Banana)
        System.out.println("Element at index 1: " + vector.get(1));

        // "Banana" ko remove kiya vector se
        vector.remove("Banana");
        System.out.println("After removing Banana, Vector size: " + vector.size());

        // Vector ke sabhi elements clear (delete) kar diye
        vector.clear();
        System.out.println("After clearing, Vector size: " + vector.size());
    }
}
