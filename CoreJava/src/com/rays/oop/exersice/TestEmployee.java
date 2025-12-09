package com.rays.oop.exersice;

public class TestEmployee {
    public static void main(String[] args) {
        // Create addresses
        Address permanentAddress1 = new Address("123 Khamekheda", "Khargoan", "Madhya Pradesh", "12345");
        Address currentAddress1 = new Address("456 chawani", "Indore", "Madhya Pradesh", "67890");
        Address permanentAddress2 = new Address("789 Rahadkot", "Khargoan", "Madhya Pradesh", "13579");
        Address currentAddress2 = new Address("246 chawani ", "Indore", "Madhya Pradesh", "24680");

        // Create employees
        Employee employee1 = new Employee("Niraj Chopra", permanentAddress1, currentAddress1);
        Employee employee2 = new Employee("Lokesh Birle", permanentAddress2, currentAddress2);

        // Create department and add employees
        Department department = new Department("Engineering", 10);
        department.addEmployee(employee1);
        department.addEmployee(employee2);

        // Print department information
        System.out.println("Department: " + department.getName());
        System.out.println("Employees:");
        for (Employee employee : department.getEmployees()) {
            if (employee != null) {
                System.out.println("Name: " + employee.getName());
                System.out.println("Permanent Address: " + employee.getPermanentAddress().getStreet() +  ", " + employee.getPermanentAddress().getCity() + ", " + employee.getPermanentAddress().getState() + " " +  employee.getPermanentAddress().getZipCode());
                       
                      
                       
                System.out.println("Current Address: " + employee.getCurrentAddress().getStreet() + ", " + employee.getCurrentAddress().getCity() + ", " +employee.getCurrentAddress().getState() + " " +  employee.getCurrentAddress().getZipCode());
                        
                        
                       
                System.out.println();
            }
        }
    }
}
