package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

    public static void main(String[] args) {

        //  ArrayList banayi (non-generic)
        ArrayList l = new ArrayList();

        // Elements add kiye
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");

        //  Index 4 pe "six" insert kiya (baaki elements shift ho jaate hain)
        l.add(4, "six"); // List becomes: [one, two, three, four, six, five]

        //  List ko sort kiya (alphabetical order)
        Collections.sort(l);

        //  Sorted list print ki
        System.out.println("Sorted List: " + l);

        //  Sublist nikali from index 1 to 3 (3 exclusive)
        ArrayList subList = new ArrayList(l.subList(1, 3));
        System.out.println("SubList (index 1 to 2): " + subList);

        //  For-each loop se sorted list print ki
        System.out.println("Iterating over sorted list:");
        for (Object obj : l) {
            String str = (String) obj;
            System.out.println(str);
        }
    }
}
