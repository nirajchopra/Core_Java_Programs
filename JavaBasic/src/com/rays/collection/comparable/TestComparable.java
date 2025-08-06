package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		//  Employee objects ki list banayi
		List list = new ArrayList();

		list.add(new Employee(5, "sanat", 1000));
		list.add(new Employee(2, "prakhar", 3000));
		list.add(new Employee(1, "riya", 2500));
		list.add(new Employee(4, "niraj", 1200));
		list.add(new Employee(3, "ajay", 5000));

		//  Comparable ke compareTo() method ke hisaab se sort karega
		Collections.sort(list);

		//  Sorted list print kar di
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
