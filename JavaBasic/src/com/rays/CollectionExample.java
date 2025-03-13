package com.rays;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("List:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Creating a Set
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(20); // Duplicate, won't be added

        System.out.println("\nSet:");
        for (int num : mySet) {
            System.out.println(num);
        }

        // Creating a Queue
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");

        System.out.println("\nQueue:");
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }

        // Creating a Deque
        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.addFirst("First");
        myDeque.addLast("Last");

        System.out.println("\nDeque:");
        for (String str : myDeque) {
            System.out.println(str);
        }
    }
}
