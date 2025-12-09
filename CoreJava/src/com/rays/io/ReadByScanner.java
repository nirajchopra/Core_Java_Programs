package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.rays.loop.WhileLoop;

public class ReadByScanner {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\LZ\\Desktop\\IO\\niraj.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		
		file.close();
		sc.close();
	}

	

}
