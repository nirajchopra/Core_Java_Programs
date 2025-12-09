package com.rays.collection.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class TestEmployeeHashcode {
    
    public static void main(String[] args) {
        
        // ---------------------------------------
        // Do employees banaye — data same, object reference alag
        // ---------------------------------------
        Employee e1 = new Employee(1, "Niraj", 900);
        Employee e2 = new Employee(1, "Niraj", 900);

        // ---------------------------------------
        // HashMap banayi, jisme Employee object ko key bana rahe hain
        // ---------------------------------------
        Map map = new HashMap();

        // ---------------------------------------
        // Pehle e1 ko key ke roop me add kiya
        // Key = e1, Value = "one"
        // ---------------------------------------
        map.put(e1, "one");

        // ---------------------------------------
        // Fir e2 ko key ke roop me add kiya
        // Agar equals() & hashCode() properly override kiye hote
        // to e1 aur e2 ko "same key" maana jata
        // aur "one" ki jagah "two" update ho jata
        // ---------------------------------------
        map.put(e2, "two");

        // ---------------------------------------
        // Map print karenge
        // Case 1: Agar equals() & hashCode() sahi likhe → sirf 1 entry
        //         Output: {1 Niraj 900=two}
        // Case 2: Agar galat likhe (jaise abhi name == e.name) → 2 alag entry
        //         Output: {1 Niraj 900=one, 1 Niraj 900=two}
        // ---------------------------------------
        System.out.println(map);
        
        
    }
}
