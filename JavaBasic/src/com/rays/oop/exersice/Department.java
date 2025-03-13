package com.rays.oop.exersice;



public class Department {
    private String name;
    private Employee[] employees;
    private int numOfEmployees;

    public Department(String name, int maxSize) {
        this.name = name;
        this.employees = new Employee[maxSize];
        this.numOfEmployees = 0;
    }

    public void addEmployee(Employee employee) {
        if (numOfEmployees < employees.length) {
            employees[numOfEmployees++] = employee;
        } else {
            System.out.println("Department is full. Cannot add more employees.");
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
