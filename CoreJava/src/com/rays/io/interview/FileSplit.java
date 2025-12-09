package com.rays.io.interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileSplit {

	public static void main(String[] args) throws IOException {

		// 1. File path jise split karna hai
		String s = "C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\split.txt";

		int count = 0; // Total lines count karne ke liye
		int noOfLine = 2; // Har new file me kitni lines honi chahiye

		File file = new File(s);

		Scanner sc = new Scanner(file); // File ko scan karne ke liye

		// File me kitni lines hai count karna
		while (sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		System.out.println("no of line " + count);

		// 2. Total kitni new files banengi ye calculate karna
		int temp = count / noOfLine; // Pure group
		int rem = count % noOfLine; // Bachi hui lines
		int noOfFile = temp; // Start with pure groups

		if (rem != 0) {
			noOfFile++; // Agar extra lines bachi hai to ek file extra chahiye
		}
		System.out.println("No of files " + noOfFile);

		// 3. Ab actual data ko read karna
		BufferedReader br = new BufferedReader(new FileReader(s));

		// 4. nof ke according files banana
		for (int i = 1; i <= noOfFile; i++) {

			// Nayi file create karna
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\Aftersplit" + i + ".txt"));

			// 5. Har new file me "nol" lines write karna
			for (int j = 1; j <= noOfLine; j++) {

				String str = br.readLine(); // Ek line read karo

				if (str != null) { // Jab tak line available hai

					bw.write(str); // File me write karo

					// 6. Agar last line nahi hai to new line add karo
					if (j != noOfLine) {
						bw.newLine();
					}
				}
			}

			bw.close(); // File close
		}

		br.close(); // Main file close
	}

}
