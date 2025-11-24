package com.rays.io.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailReadWrite {
	public static void main(String[] args) throws IOException {
		// Yeh file ko line-by-line read karne ke liye object banata hai.
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\BlankEmail.txt"));

		// Yeh new file kholta hai jisme hum valid email likhenge.
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\Email.txt"));

		// Yeh rule (pattern) hai jisse hum check karenge ki email sahi hai ya nahi.
		String emailreg = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

		String str = br.readLine(); // File ki pehli line read karta hai.

		while (str != null) { // Jab tak file ki lines khatam nahi hoti, loop chalta rahega.
			if (str.matches(emailreg)) { // Agar yeh line email rule follow karti hai (valid email hai),
				pw.println(str); // Toh us email ko output file me likh do.
			}
			str = br.readLine(); // Next line read kar lo.
		}

		pw.close(); // Output file close kar deta hai.
		br.close(); // Input file close kar deta hai.

		System.out.println("chal gaya...!"); // Sirf ek message print karta hai ki program chal gaya.
	}
}
