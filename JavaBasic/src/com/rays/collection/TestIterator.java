package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    
    public static void main(String[] args) {
        
        // List ka object banaya using ArrayList (non-generic)
        List list = new ArrayList();
        
        // List me mixed type ke elements add kiye
        list.add(100);       // Integer
        list.add("one");     // String
        list.add("two");
        list.add("three");

        // Pura list print kiya
        System.out.println(list); // Output: [100, one, two, three]

        // ================================
        // 1️ Traditional For Loop se list ke elements access kiye
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("====================================================");

        // ================================
        // 2️ Enhanced For-Each Loop ka use kiya
        for(Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("====================================================");

        // ================================
        // 3️ Iterator ka use karke elements access kiye
        Iterator it = list.iterator();  // Iterator object liya list ke liye

        // Jab tak list me next element hai, tab tak loop chalega
        while(it.hasNext()) {
            System.out.println(it.next()); // Current element print karega aur pointer next par le jaayega
        }
    }
}
