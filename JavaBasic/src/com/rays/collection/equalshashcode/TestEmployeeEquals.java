package com.rays.collection.equalshashcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeEquals {

	public static void main(String[] args) {

		//  2 Employee objects banaye
		Employee e1 = new Employee(1, "abc", 1000);
		Employee e2 = new Employee(2, "xyz", 2000);

		//  List banayi aur dono objects add kiye
		List list = new ArrayList();
		list.add(e1);
		list.add(e2);

		//  Ek naya Employee object banaya (same as e2)
		Employee e = new Employee(2, "xyz", 2000);

		//  Check: Kya list me 'e' hai? 
		// System.out.println(list.contains(e));

		//  Remove object 'e' from list (agar equals() sahi hai to match hoga)
		list.remove(e);

		//  Print remaining list
		System.out.println(list); // Expected: only e1 should remain
	}
}
