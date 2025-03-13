package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLineByLine {
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\LZ\\Desktop\\IO\\write.txt",true);
		
		PrintWriter out = new PrintWriter(file);
		
		out.println("Hello bhai");
		out.println("kkrh...?????");
		
		out.close();
		file.close();
		System.out.println("Data Write Successfully......!!!");
		
	
	}

}
