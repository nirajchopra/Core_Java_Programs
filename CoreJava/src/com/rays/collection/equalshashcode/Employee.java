package com.rays.collection.equalshashcode;

public class Employee {

    // -----------------------------
    // Instance variables (fields)
    // -----------------------------
    private int id;        // unique employee ID
    private String name;   // employee name
    private int salary;    // employee salary

    // -----------------------------
    // Constructor
    // -----------------------------
    // Jab new Employee banega to ye values set karenge
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // -----------------------------
    // Getters (read-only access)
    // -----------------------------
    public int getId() {
        return id;        // id return karega
    }

    public String getName() {
        return name;      // name return karega
    }

    public int getSalary() {
        return salary;    // salary return karega
    }

    // -----------------------------
    // equals() method
    // -----------------------------
    // Ye decide karega ki do Employee objects "equal" hain ya nahi.
    // By default Object class ka equals() reference check karta hai
    // Lekin hum yaha content (id, name, salary) compare kar rahe hain.
    @Override
    public boolean equals(Object obj) {

        System.out.println("in equals method");

        // Object ko Employee me typecast kar rahe hain
        Employee e = (Employee) obj;

        // Equals ka logic:
        // 1. id same honi chahiye
        // 2. name same hona chahiye (yaha == use kiya hai, jo sirf references compare karega
        //    Better hota equals() use karna: this.name.equals(e.name))
        // 3. salary same honi chahiye
        boolean b = this.id == e.id && this.name == e.name && this.salary == e.salary;

        return b;
    }

    // -----------------------------
    // hashCode() method
    // -----------------------------
    // Jab bhi object ko HashSet, HashMap, Hashtable me use karte ho
    // to sabse pehle hashCode() call hota hai.
    // Agar hashCode same aaye, tab equals() check hota hai.
    @Override
    public int hashCode() {

        System.out.println("in hashCode method");

        // id + name + salary ko ek String bana rahe hain
        String str = id + name + salary;

        // String class ka inbuilt hashCode() use karke int code return karenge
        return str.hashCode();
    }

    // -----------------------------
    // toString() method
    // -----------------------------
    // Jab System.out.println(object) likhte ho,
    // to by default Object ka toString() call hota hai
    // jo memory address print karta hai.
    // Lekin humne isse override karke readable format banaya hai.
    @Override
    public String toString() {
        String str = id + " " + name + " " + salary;
        return str; // Example: "101 Niraj 50000"
    }
}
