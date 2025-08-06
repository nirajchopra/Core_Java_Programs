package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        // List ka object banaya using ArrayList
        List c = new ArrayList();

        // Elements add kiye list me (characters)
        c.add('a');
        c.add('b');
        c.add('c');
        c.add('d');
        c.add('e');

        // Puri list print ki
        System.out.println("List : " + c); // Output: [a, b, c, d, e]

        // Index 2 par ek new element " one" add kiya (baaki elements shift ho jaate hain)
        c.add(2, " one"); // ab list banegi: [a, b,  one, c, d, e]

        //  GALTI: c.add(2) is wrong — add() method ek parameter leta hai ya phir (index, element)
        // YEH LINE HATA DO YA COMMENT KAR DO
        // System.out.println("List : " + c.add(2));  //  invalid: yeh runtime error dega

        // Index 2 ka element print kiya (jo ab " one" hai)
        System.out.println("List get(2) : " + c.get(2)); // Output: " one"

        // Index 2 ka element remove kar diya (wapis purani position aa jaayegi)
        c.remove(2); // " one" remove ho gaya, list banegi: [a, b, c, d, e]
        System.out.println("List after remove(2): " + c);

        // Index 2 par naya value "one" set kiya (overwrite)
        c.set(2, "one"); // ab list: [a, b, one, d, e]
        System.out.println("List after set(2, \"one\"): " + c);

        // 'b' ka index check kiya
        System.out.println("Index of 'b' : " + c.indexOf('b')); // Output: 1

        // Sublist nikali from index 0 to 3 (3 exclusive): [a, b, one]
        System.out.println("SubList (0 to 3): " + c.subList(0, 3));
    }
}
