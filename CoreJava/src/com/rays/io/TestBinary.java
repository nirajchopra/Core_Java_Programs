package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestBinary {
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("C:\\Users\\LZ\\Desktop\\codingwallpaper.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\LZ\\Desktop\\IO\\nrc.jpg");
		
		int ch = in.read();
		
		while (ch != -1) {
			System.out.print((char)ch);
			out.write(ch);
			ch = in.read();
			
		}
		out.close();
		in.close();
	}

}
