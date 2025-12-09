package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {

		//  Employee objects ki list banayi
		List list = new ArrayList();

		list.add(new Employee(5, "sanat", 1000));
		list.add(new Employee(2, "prakhar", 3000));
		list.add(new Employee(1, "niraj", 2500));
		list.add(new Employee(4, "riya", 1200));
		list.add(new Employee(3, "ajay", 5000));

		//  Default sort commented (only works with Comparable implementation)
		// Collections.sort(list);

		//  Custom sorting using different Comparator classes
		// Collections.sort(list, new OrderByIdAsc());   //  ID ascending
		// Collections.sort(list, new OrderByIdDesc());  //  ID descending
		// Collections.sort(list, new OrderByNameAsc()); //  Name A-Z
		Collections.sort(list, new OrderByIdDesc());      //  Sorting by ID descending

		//  Sorted list print ho rahi hai
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
