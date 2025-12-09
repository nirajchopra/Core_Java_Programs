package com.rays.collection.comparator;

import java.util.Comparator;

//  Comparator implement kiya for custom sorting by name
public class OrderByNameAsc implements Comparator<Employee>  {

	@Override
	public int compare(Employee e1, Employee e2) {
		//  String ka compareTo() use kiya — jo lexicographic comparison karta hai
		// Agar e1 ka name < e2 ka name, to -ve return (A-Z sort hoga)
		return e1.getName().compareTo(e2.getName());
	}
}
