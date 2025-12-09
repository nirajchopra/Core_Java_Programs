package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\LZ\\Desktop\\IO\\write.txt");
		file.write(" xyz ");
		
		file.close();
	}

}
