package com.rays.BlogQuestion;

import java.lang.reflect.Constructor;

public class ReflectionExample {
    public void display() {
        System.out.println("Object created using Constructor.newInstance()");
    }

    public static void main(String[] args) {
        try {
            Constructor<ReflectionExample> constructor = ReflectionExample.class.getDeclaredConstructor();
            ReflectionExample example = constructor.newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
