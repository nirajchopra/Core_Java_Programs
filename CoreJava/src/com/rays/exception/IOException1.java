package com.rays.exception;

import java.io.FileReader;
import java.io.IOException;

public class IOException1 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("Non Existing file.txt");
			int data;
			while((data = reader.read()) != -1) {
				System.out.println(data);
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
	}
}
