package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Niraj", 10000);
		Employee e2 = new Employee(2, "Naman", 5000);
		
		List list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			Employee e = (Employee) obj;
			
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
		
	}

}
