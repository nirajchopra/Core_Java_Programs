package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        // Ek HashMap banaya jisme key = Integer, value = String
        Map<Integer, String> map = new HashMap<>();

        // Map me key-value pairs add kiye
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        // Pura map print kiya
        System.out.println(map);

        // Key 1 ko remove kiya map se
        map.remove(1);
        System.out.println(map);

        // Key 4 ke corresponding value print ki
        System.out.println(map.get(4));

        // Check kiya ki key 4 map me hai ya nahi
        System.out.println(map.containsKey(4));
    }
}
