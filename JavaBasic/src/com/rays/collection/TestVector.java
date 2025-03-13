package com.rays.collection;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
       
        Vector vector = new Vector();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        System.out.println("Vector size: " + vector.size());

        System.out.println("Elements in Vector:");
        for (Object fruit : vector) {
            System.out.println((String) fruit);
        }

        System.out.println("Element at index 1: " + (String) vector.get(1));

        vector.remove("Banana");
        System.out.println("After removing Banana, Vector size: " + vector.size());

        vector.clear();
        System.out.println("After clearing, Vector size: " + vector.size());
    }
}
