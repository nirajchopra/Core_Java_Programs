package com.rays.collection.equalshashcode;

public class TestEH {
	public static void main(String[] args) {

		// 1. Ye part Strings ka example hai (commented hai abhi)
		/*
		String s1 = "abc";
		String s2 = "abc";

		// s1 and s2 dono same literal hai, so memory bhi same hai (string pool)
		System.out.println(s1.equals(s2));       // true
		System.out.println(s1.hashCode());       // same hash
		System.out.println(s2.hashCode());       // same hash
		*/

		//  2. Custom Employee objects create kiye (same data, different objects)
		Employee e1 = new Employee(1, "abc", 1000);
		Employee e2 = new Employee(1, "abc", 1000);

		//  equals() method call karega — override hone par values compare hongi
		System.out.println(e1.equals(e2));       // true (agar equals() sahi override hai)

		//  hashCode() method dono par chalega
		System.out.println(e1.hashCode());       // same hash if overridden correctly
		System.out.println(e2.hashCode());       // same hash
	}
}
