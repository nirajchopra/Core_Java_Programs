package com.rays.io;

import java.io.FileReader;

public class ReadCharByChar {
	public static void main(String[] args) throws Exception{
		FileReader file = new FileReader("C:\\Users\\LZ\\Desktop\\IO\\niraj.txt");
		int ch = file.read();
		while (ch != -1) {
			System.out.print((char)ch);
			ch = file.read();
			
		}
		file.close();
		
	}

}
