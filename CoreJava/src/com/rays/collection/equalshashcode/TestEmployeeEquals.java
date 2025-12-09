package com.rays.collection.equalshashcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeEquals {

    public static void main(String[] args) {

        // -----------------------------
        // 2 Employee objects banaye
        // -----------------------------
        Employee e1 = new Employee(1, "abc", 1000);
        Employee e2 = new Employee(2, "xyz", 2000);

        // -----------------------------
        // List banayi aur dono employees ko add kiya
        // -----------------------------
        List list = new ArrayList();
        list.add(e1);
        list.add(e2);

        // -----------------------------
        // Ek naya Employee object banaya (same data as e2)
        // Lekin ye ek alag object hai memory me
        // -----------------------------
        Employee e = new Employee(2, "xyz", 2000);

        // -----------------------------
        // Check karte hain: kya list me 'e' hai?
        // Ye method internally equals() call karta hai.
        // Agar equals() properly override na ho to false aayega
        // because reference alag hai.
        // Agar equals() content-based check kare to true aayega.
        // -----------------------------
//      System.out.println(list.contains(e));

        // -----------------------------
        // Remove kar rahe hain object 'e' ko list se
        // remove() bhi equals() method use karke matching karta hai
        // Agar equals() sahi likha ho → e2 match hoga aur remove ho jayega
        // Agar equals() galat likha ho → kuch remove nahi hoga
        // -----------------------------
        list.remove(e);

        // -----------------------------
        // Print remaining list
        // Agar equals() sahi hai → sirf e1 bachega
        // Agar equals() sahi nahi hai → e1 aur e2 dono rahenge
        // -----------------------------
        System.out.println(list); 
    }
}
