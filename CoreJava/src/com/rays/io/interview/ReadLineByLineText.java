package com.rays.io.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineText {

    public static void main(String[] args) throws IOException {

        // Step 1: FileReader banaya file ko read karne ke liye
        FileReader fr = new FileReader("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\primitive.txt");

        // Step 2: BufferedReader use kiya fast line-by-line reading ke liye
        BufferedReader br = new BufferedReader(fr);

        // Step 3: Pehli line read ki
        String str = br.readLine();

        // Step 4: Jab tak line null na ho, print karte raho
        while (str != null) {
            System.out.println(str);

            // Step 5: Next line read karo
            str = br.readLine();
        }

        // Step 6: File close kar do
        br.close();
        fr.close();
    }
}
