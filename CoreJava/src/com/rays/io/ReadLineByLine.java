package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\LZ\\Desktop\\IO\\niraj.txt");
		BufferedReader in = new BufferedReader(file);
		
		String line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
			
		}
	}

}
