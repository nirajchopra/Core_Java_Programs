package com.rays.BlogQuestion;

public class CloneExample implements Cloneable {
    public void display() {
        System.out.println("Object created using clone()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            CloneExample original = new CloneExample();
            CloneExample clone = (CloneExample) original.clone();
            clone.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}