package com.rays.io.interview;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {

    public static void main(String[] args) throws IOException {

        // STEP 1: Write primitive data into file
        DataOutputStream out = new DataOutputStream(
                new FileOutputStream("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\primitive.txt"));

        out.writeInt(10);         // Writing an integer
        out.writeBoolean(true);   // Writing a boolean
        out.writeDouble(45.25);   // Writing a double value
        out.writeFloat(2.2F);     // Writing a float value
        out.writeChar('a');       // Writing a character

        out.close();

        System.out.println("Data written successfully...");

        // STEP 2: Read primitive data from same file
        DataInputStream in = new DataInputStream(
                new FileInputStream("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\primitive.txt"));

        System.out.println(in.readInt());
        System.out.println(in.readBoolean());
        System.out.println(in.readDouble());
        System.out.println(in.readFloat());
        System.out.println(in.readChar());

        in.close();
    }
}
