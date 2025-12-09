package com.rays.collection.comparator;

import java.util.Comparator;

//  Comparator implement kiya for sorting by name in descending order (Z to A)
public class OrderByNameDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		//  yahan compareTo() ka order reverse kiya hai: e2 vs e1
		//  Agar e2 ka naam alphabetically pehle hai to +ve return
		return e2.getName().compareTo(e1.getName());
	}
}
