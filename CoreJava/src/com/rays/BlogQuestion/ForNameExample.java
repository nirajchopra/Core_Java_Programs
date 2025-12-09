package com.rays.BlogQuestion;

public class ForNameExample {

    public void display() {
        System.out.println("Object created using Class.forName() and newInstance()");
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.rays.BlogQuestion.ForNameExample");
            ForNameExample example = (ForNameExample) clazz.getDeclaredConstructor().newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
