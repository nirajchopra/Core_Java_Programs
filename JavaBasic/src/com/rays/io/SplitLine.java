package com.rays.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SplitLine {
    public static void main(String[] args) throws Exception {
        
            File inputFile = new File("C:\\Users\\LZ\\Desktop\\IO\\splitline.txt"); 
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            int lineNumber = 1;
            
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                FileWriter writer = new FileWriter("C:\\Users\\LZ\\Desktop\\IO\\AfterSpliteline" + lineNumber/2 + ".txt", true); 
                writer.write(line + "\n");
                if (lineNumber % 2 == 0) {
                    writer.close();
                }
            }
            reader.close();
    }
    }

