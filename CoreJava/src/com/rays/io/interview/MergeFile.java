package com.rays.io.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\niraj1.txt");
		// Yeh output file hai jisme saari files ka data merge hokar aayega.

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\niraj2.txt"));
		// Pehli input file ko line-by-line read karne ke liye.

		String s1 = br.readLine();
		// Pehli line read ki.

		while (s1 != null) {
			// Jab tak file ki lines khatam nahi hoti

			fw.write(s1);
			// Us line ko output file me write karo.

			s1 = br.readLine();
			// Next line read karo.
		}

		br.close();
		// Pehli input
		fw.close();
		// Output file (merge result) close.

		System.out.println("successful");
		// Console me message print – merging successful.
	}
}