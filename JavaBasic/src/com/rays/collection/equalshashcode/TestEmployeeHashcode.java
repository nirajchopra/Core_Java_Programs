package com.rays.collection.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class TestEmployeeHashcode {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Niraj", 900);
		Employee e2 = new Employee(1, "Niraj", 900);
		
		Map map = new HashMap();
		
		map.put(e1, "one");
		map.put(e2, "two");
		
		System.out.println(map);
		
		
	}

}
