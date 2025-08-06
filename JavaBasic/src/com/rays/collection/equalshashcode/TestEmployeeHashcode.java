package com.rays.collection.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class TestEmployeeHashcode {
	
	public static void main(String[] args) {
		
		//  Do employees banaye — values same, reference different
		Employee e1 = new Employee(1, "Niraj", 900);
		Employee e2 = new Employee(1, "Niraj", 900);

		//  HashMap banayi jisme Employee object key hai
		Map map = new HashMap();

		//  Pehle e1 add kiya as key
		map.put(e1, "one");

		//  Fir e2 add kiya as key — ideally should replace e1's value
		map.put(e2, "two");

		//  Print the map — expected: sirf ek entry hona chahiye (key same hai)
		System.out.println(map);
	}
}
