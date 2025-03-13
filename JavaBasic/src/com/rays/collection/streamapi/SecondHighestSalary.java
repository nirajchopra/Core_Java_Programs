package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Lucky", 50000));
		employees.add(new Employee("Himanshu", 20000));
		employees.add(new Employee("Dau", 40000));
		employees.add(new Employee("Niraj", 80000));
		employees.add(new Employee("Pradhyman", 30000));
		
		double secondHighestSalary = employees.stream()
				.map(e -> e.getSalary())
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(0.0);
				
				System.out.println("Second Highest Salary: " + secondHighestSalary);
	}

}
