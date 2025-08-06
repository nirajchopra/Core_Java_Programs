package com.rays.collection.comparator;

import java.util.Comparator;

//  Comparator interface implement kiya, jo 2 Employee objects ka comparison karega
public class OrderByIdAsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//  Agar o1 ki ID chhoti hai to -ve, barabar ho to 0, badi ho to +ve return karega
		//  Isse sort ascending order me hoga
		return o1.getId() - o2.getId();
	}
}
