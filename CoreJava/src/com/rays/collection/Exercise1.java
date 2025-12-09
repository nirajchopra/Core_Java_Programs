package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise1 {
    public static void main(String[] args) {

        //  ArrayList banayi (non-generic, mixed types bhi le sakti hai)
        ArrayList c1 = new ArrayList();

        //  Elements add kiye (characters)
        c1.add('a');
        c1.add('b');
        c1.add('c');
        c1.add('d');
        c1.add('e');

        //  Index 1 par 'f' add kiya (baaki elements shift ho jaayenge)
        // List banegi: [a, f, b, c, d, e]
        c1.add(1, 'f');

        //  Iterator banaya c1 list ke liye
        Iterator it = c1.iterator();

        //  Jab tak list me next element hai, tab tak print karte jaao
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj); // Output each character
        }
    }
}
