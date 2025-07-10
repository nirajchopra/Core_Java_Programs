package com.rays.BlogQuestion;

import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

public class DeserializationExample implements Serializable {
    public void display() {
        System.out.println("Object created using deserialization");
    }

    public static void main(String[] args) {
        try {
            // Serialize the object
        	DeserializationExample original = new DeserializationExample();
            FileOutputStream fos = new FileOutputStream("example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(original);
            oos.close();

            // Deserialize the object
            FileInputStream fis = new FileInputStream("example.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            DeserializationExample deserialized = (DeserializationExample) ois.readObject();
            ois.close();

            deserialized.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}