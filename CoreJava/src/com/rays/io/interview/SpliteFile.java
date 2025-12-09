package com.rays.io.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpliteFile {
    public static void main(String[] args) throws Exception {

        int count = 0;
        File fileToSplit = new File("C:\\User\\niraj\\OneDrive\\Desktop\\IO\\splitFile.txt");
        Scanner sc = new Scanner(fileToSplit);

        // Count total lines
        while (sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }
        System.out.println("Lines in the file : " + count);

        // Number of output files
        int numberOfFile = (count % 2 == 0) ? (count / 2) : (count / 2 + 1);
        System.out.println("No of files to be generated : " + numberOfFile);

        BufferedReader br = new BufferedReader(new FileReader(fileToSplit));

        // Correct loop condition
        for (int i = 1; i <= numberOfFile; i++) {

            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\AfterSplit" + i + ".txt"));

            // Write 2 lines per file
            for (int j = 1; j <= 2; j++) {
                String line = br.readLine();
                if (line != null) {
                    pw.println(line);
                }
            }

            pw.close();
        }

        br.close();
    }
}
