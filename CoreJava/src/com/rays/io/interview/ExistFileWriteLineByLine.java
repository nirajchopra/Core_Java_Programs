package com.rays.io.interview;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExistFileWriteLineByLine {
	
	public static void main(String[] args) throws IOException {	
		// File ko write mode me kholna (true = append mode)
		//(true) Matlab agar file already exist karti hai, to purani file ka data delete nahi hoga.
		//Naya data file ke last me add (append) ho jayega.
		FileWriter file = new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\scanner.txt", true);
		
		// Line-by-line likhne ke liye PrintWriter
		PrintWriter out = new PrintWriter(file);
		
		// File me lines write karna
		out.println("hello bhai");
		out.println("kya kar raha hai ");
		out.println("hey i am niraj chopra");

		// Writer close karna
		out.close();
		file.close();
		
		// Output console message
		System.out.println("successfully write data");
	}
}
