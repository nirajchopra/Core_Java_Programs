package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayList {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		Set unique = new HashSet();
		Set duplicate = new HashSet();
		
		for (Object o: l){
            if(!unique.add(o)){
                duplicate.add(o);
            }

        }
        List duplicateList = new ArrayList(duplicate);
        List original = new ArrayList(unique);

        System.out.println("Original List: " + l);
        System.out.println("Duplicate list: " + duplicateList);
        System.out.println("unique List: " + original);
		
	}

}
