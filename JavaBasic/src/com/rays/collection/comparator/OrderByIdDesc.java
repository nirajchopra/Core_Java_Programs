package com.rays.collection.comparator;

import java.util.Comparator;

//  Comparator implement kiya — custom sorting ke liye
public class OrderByIdDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//  IDs ko compare kiya — o2 minus o1 se
		//  Isse bada ID pehle aayega, chhota baad me → descending order
		return o2.getId() - o1.getId();
	}
}
