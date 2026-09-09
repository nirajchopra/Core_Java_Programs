package com.rays.oop;

import java.util.Scanner;

/*
 * ===========================
 * OOP CONCEPTS USED
 * ===========================
 * 1. Abstraction
 * 2. Encapsulation
 * 3. Inheritance
 * 4. Polymorphism (Runtime)
 * 5. Method Overriding
 */

// ======================= ABSTRACTION =======================
// Abstract class is used to hide implementation details.
// It contains abstract methods whose implementation is provided
// by child classes.
abstract class Shapee {

    // Common variable for all shapes
    float area;

    // Abstract methods (Only declaration)
    abstract void acceptInput();

    abstract void calcArea();

    // Concrete method
    // Displays the calculated area
    public void dispArea() {
        System.out.println("Area : " + area);
    }
}

// ======================= INHERITANCE =======================
// Square class inherits Shapee class.
class Square extends Shapee {

    // =================== ENCAPSULATION ===================
    // Private variable cannot be accessed directly outside class.
    private float side;

    // Overriding abstract method
    @Override
    void acceptInput() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the side of square : ");

        // Taking input
        // Acts like setter
        side = scan.nextFloat();
    }

    // Method Overriding
    @Override
    void calcArea() {

        // Formula of square
        area = side * side;
    }
}

// ======================= INHERITANCE =======================
class Rectangle extends Shapee {

    float length;
    float breadth;

    // Overriding parent method
    @Override
    void acceptInput() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        length = scan.nextFloat();

        System.out.print("Enter the breadth of rectangle : ");
        breadth = scan.nextFloat();
    }

    // Overriding parent method
    @Override
    void calcArea() {

        // Formula of rectangle
        area = length * breadth;
    }
}

// ======================= INHERITANCE =======================
class Circlee extends Shapee {

    float radius;

    // Overriding parent method
    @Override
    void acceptInput() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");

        radius = scan.nextFloat();
    }

    // Overriding parent method
    @Override
    void calcArea() {

        // Formula of circle
        area = (float)(Math.PI * Math.pow(radius, 2));
    }
}

// ======================= POLYMORPHISM =======================
// Parent class reference can hold child class objects.
class Maths {

    public void geometry(Shapee shape) {

        /*
         * Runtime Polymorphism
         *
         * If Square object is passed,
         * Square methods execute.
         *
         * If Rectangle object is passed,
         * Rectangle methods execute.
         *
         * If Circle object is passed,
         * Circle methods execute.
         */

        shape.acceptInput();   // Dynamic Method Dispatch

        shape.calcArea();      // Calls child class method

        shape.dispArea();      // Parent class method
    }
}

public class FullOOPConcept {

    public static void main(String[] args) {

        // Creating objects of child classes
        Square s = new Square();

        Rectangle r = new Rectangle();

        Circlee c = new Circlee();

        // Creating object of Maths class
        Maths m = new Maths();

        // =================== RUNTIME POLYMORPHISM ===================
        // Parent reference (Shapee) points to Square object
        m.geometry(s);

        // Parent reference points to Rectangle object
        m.geometry(r);

        // Parent reference points to Circle object
        m.geometry(c);
    }
}

/*
=========================================================
FLOW OF PROGRAM
=========================================================

main()

↓

Square object created
Rectangle object created
Circle object created

↓

m.geometry(s)

↓

acceptInput() of Square

↓

calcArea() of Square

↓

dispArea()

---------------------------------------------------------

m.geometry(r)

↓

acceptInput() of Rectangle

↓

calcArea() of Rectangle

↓

dispArea()

---------------------------------------------------------

m.geometry(c)

↓

acceptInput() of Circle

↓

calcArea() of Circle

↓

dispArea()

=========================================================

OOP Concepts Summary

1. Abstraction
   -> abstract class Shapee

2. Encapsulation
   -> private float side

3. Inheritance
   -> extends Shapee

4. Method Overriding
   -> acceptInput() and calcArea() in every child class

5. Runtime Polymorphism
   -> geometry(Shapee shape)

6. Dynamic Method Dispatch
   -> shape.acceptInput()
   -> shape.calcArea()

=========================================================
*/