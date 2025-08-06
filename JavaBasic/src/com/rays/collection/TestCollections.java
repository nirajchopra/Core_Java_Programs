package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class TestCollections {

    public static void main(String[] args) {

        // Collection interface ka object banaya using ArrayList implementation
        Collection co = new ArrayList();

        // Elements add kiye collection me
        co.add("bura mat dekho");
        co.add("bura mat suno");
        co.add("bura mat bolo");

        // Collection ka size print kiya
        System.out.println("Length of Size: " + co.size());

        // Enhanced for loop ka use karke Collection ke elements print kiye
        for (Object Obj1 : co) {
            System.out.println(Obj1);
        }

        // Collection ko Object array me convert kiya using toArray()
        Object[] oArray = co.toArray();

        // Array ko loop karke print kiya (cast karke String banaya)
        for (Object Obj : oArray) {
            String s = (String) Obj;
            System.out.println(s);
        }
    }

    //  Ye method unused hai — abhi kuch kaam nahi kar raha
    public static void shuffle(List<String> e) {
        // TODO: method implementation baad me add karna
    }
}
