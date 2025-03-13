package com.rays.collection.comparator;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getSalary() {
		return salary;
	}


	@Override
	public int compareTo(Employee o) {
		
		return this.salary-o.salary;
	}
	
	public String toString() {
		return id + " " + name + " " + salary;
	}

}
