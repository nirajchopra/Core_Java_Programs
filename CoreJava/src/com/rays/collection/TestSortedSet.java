package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

    public static void main(String[] args) {

        // TreeSet banaya jo SortedSet implement karta hai
        // Ye elements ko ascending (natural order) me store karega
        SortedSet<String> s = new TreeSet<>();

        // Elements add kiye (TreeSet automatically sort kar dega)
        s.add("one");
        s.add("two");
        s.add("three");

        // Sorted order me elements print honge
        // Yaha "one", "three", "two" add hue the
        // Lekin output hoga: one, three, two (alphabetical order ke hisaab se)
        System.out.println("Sorted Elements:");
        for (String value : s) {
            System.out.println(value);
        }

        // Sabse pehla element (alphabetically smallest) print karega
        System.out.println("First Element: " + s.first());   // one

        // Sabse last element (alphabetically largest) print karega
        System.out.println("Last Element: " + s.last());     // two

        // headSet("one") → "one" se chhote saare elements dega
        // Yaha "one" sabse chhota hai → empty set return karega
        System.out.println("HeadSet : " + s.headSet("one")); 

        // tailSet("three") → "three" aur uske baad ke saare elements dega
        // Yaha output hoga: [three, two]
        System.out.println("TailSet : " + s.tailSet("three")); 

        // subSet("one", "three") → "one" (inclusive) se lekar "three" (exclusive) tak ke elements
        // Yaha sirf "one" milega
        System.out.println("SubSet : " + s.subSet("one", "three")); 
    }
}
