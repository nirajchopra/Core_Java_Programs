package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadByKeyBoard {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in  = new BufferedReader(isReader);
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\LZ\\Desktop\\IO\\keyboard.txt",true));
		
		String line = in.readLine();
		while (!(line.equals("bye"))) {
			out.print(line);
			line = in.readLine();			
		}
		
		out.close();
		in.close();
	}
}
