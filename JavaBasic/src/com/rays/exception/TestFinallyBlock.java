package com.rays.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFinallyBlock {
	
	public static void main(String[] args) throws IOException {
		
		InputStream input  = null;
		try {
			FileInputStream	input1 = new FileInputStream("file.text");
			int data = input1.read();
			while (data != -1) {
				System.out.println((char) data);
				data = input1.read();
			}
		} finally {
			if(input!= null) {
				input.close();
			}
			

		}
	}

}
