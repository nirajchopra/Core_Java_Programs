package com.rays.oop.exersice;

public class Employee {
    private String name;
    private Address permanentAddress;
    private Address currentAddress;

    public Employee(String name, Address permanentAddress, Address currentAddress) {
        this.name = name;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
    }

    public String getName() {
        return name;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }
}
