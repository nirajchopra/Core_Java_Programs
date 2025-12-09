package com.rays.io.interview;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {

    public static void main(String[] args) throws IOException {

        // Step 1: FileReader banaya file ko read karne ke liye
        FileReader file = new FileReader("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\scanner.txt");

        // Step 2: Pehla character read kiya (as int)
        int i = file.read();

        // Step 3: Jab tak file finish nahi hoti (i == -1 means end of file)
        while (i != -1) {

            // Step 4: int ko char me convert karke print kiya
            System.out.print((char) i);

            // Step 5: Next character read kiya
            i = file.read();
        }

        // Step 6: File close kar di
        file.close();
    }
}
