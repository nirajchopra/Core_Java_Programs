package com.rays.io.interview;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {

	public static void main(String[] args) throws IOException {

		// Step 1: File ko read karne ke liye FileReader banaya
		FileReader file = new FileReader("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\scanner.txt");

		// Step 2: Scanner ko file ke sath attach kiya
		Scanner sc = new Scanner(file);

		// Step 3: Jab tak file me data hai -> line by line print karo
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

		// Step 4: FileReader aur Scanner close kar diya
		file.close();
		sc.close();
	}
}
