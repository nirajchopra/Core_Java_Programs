package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

    public static void main(String[] args) {

        //  Collection c1 banaya using ArrayList
        Collection c1 = new ArrayList();

        // Elements add kiye c1 me (characters)
        c1.add('1');
        c1.add('2');
        c1.add('3');
        c1.add('4');
        c1.add('5');

        //  Dusri Collection c2 banayi
        Collection c2 = new ArrayList();

        // Elements add kiye c2 me
        c2.add('a');
        c2.add('b');
        c2.add('c');
        c2.add('d');
        c2.add('e');

        System.out.println("c1 add : " + c1); // [1, 2, 3, 4, 5]
        System.out.println("c2 add : " + c2); // [a, b, c, d, e]

        // addAll() — c2 ke elements c1 me add kar diye
        c1.addAll(c2);
        System.out.println("c1 after addAll(c2) : " + c1); // [1,2,3,4,5,a,b,c,d,e]

        //  c2 change nahi hua, sirf c1 me add hua
        System.out.println("c2 remains unchanged : " + c2); // [a,b,c,d,e]

        // clear() — sabhi elements hata diye c1 se
        c1.clear();
        System.out.println("c1 clear : " + c1); // []

        //  contains() — check kiya ki element 1 hai ya nahi
        System.out.println("c1 contains 1? : " + c1.contains(1)); // false

        //  containsAll() — check kiya ki c1 me c2 ke sabhi elements hai ya nahi
        System.out.println("c1 containsAll c2? : " + c1.containsAll(c2)); // false

        //  isEmpty() — c1 empty hai ya nahi
        System.out.println("c1 isEmpty? : " + c1.isEmpty()); // true

        //  remove() — 'a' ko c2 se remove kiya
        c2.remove('a');
        System.out.println("c2 after remove('a') : " + c2); // [b, c, d, e]

        //  removeAll() — c1 ke elements ko c2 se hata diya (lekin c1 to khali hai)
        c2.removeAll(c1); // No effect since c1 is empty
        System.out.println("c2 after removeAll(c1) : " + c2); // [b, c, d, e]

        //  size() — c1 ka size check kiya
        System.out.println("c1 size : " + c1.size()); // 0

        //  retainAll() — c1 me sirf wahi elements rakho jo c2 me bhi hain
        c1.retainAll(c2); // No effect, already empty
        System.out.println("c1 after retainAll(c2) : " + c1); // []
        System.out.println("c2 after retainAll(c2) : " + c2); // [b, c, d, e]
    }
}
