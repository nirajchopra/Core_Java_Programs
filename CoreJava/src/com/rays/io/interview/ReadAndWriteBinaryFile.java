package com.rays.io.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

    public static void main(String[] args) throws IOException {

        String source = "C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\FourPillar.png";
        //   Yeh original image ka path hai (jise copy karna hai).
        
        String target = "C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\4Pillar.png";
        //   Yeh destination file ka path hai (jaha copy banegi).

        FileInputStream in = new FileInputStream(source);
        //   Source file ko **byte-by-byte** read karne ke liye stream open ki.
        
        FileOutputStream out = new FileOutputStream(target);
        //   Target file me **byte-by-byte** data write karne ke liye stream open ki.

        int i = in.read();
        //   Yeh first byte read karta hai; agar data khatam ho jaye to -1 return karta hai.
        
        while(i != -1) {
            //   Jab tak file ke bytes milte rahe tab tak loop chalega.
            
            out.write(i);
            //   Current byte ko new file (copy file) me write kar deta hai.
            
            i = in.read();
            //   Next byte read karo.
        }

        System.out.println("successful");
        //   Console me message print — file successfully copy ho gayi.
    }
}

