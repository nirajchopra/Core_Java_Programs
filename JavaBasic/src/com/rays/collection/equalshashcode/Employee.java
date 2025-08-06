package com.rays.collection.equalshashcode;

public class Employee {

    private int id;
    private String name;
    private int salary;

    //  Constructor to initialize the object
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //  Getters for accessing private fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    //  equals() method — Object comparison ka kaam karta hai
    @Override
    public boolean equals(Object obj) {

        System.out.println("in equals method");

        //  Typecast kar rahe hain Object ko Employee me
        Employee e = (Employee) obj;

        //  Compare kar rahe hain: id, name, salary sab equal hai ya nahi
        boolean b = this.id == e.id && this.name == e.name && this.salary == e.salary;

        return b;
    }

    //  hashCode() — Unique code generate karta hai, mostly Set/Map ke use me
    @Override
    public int hashCode() {

        System.out.println("in hashCode method");

        //  id + name + salary ko string banakar uska hashCode nikaala
        String str = id + name + salary;

        return str.hashCode();  // Java ke inbuilt hashCode() function ka use
    }

    //  toString() — Jab object ko print karte ho to kya dikhna chahiye
    @Override
    public String toString() {
        String str = id + " " + name + " " + salary;
        return str;
    }
}
