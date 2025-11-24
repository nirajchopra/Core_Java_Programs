package com.rays.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SplitLine {
	public static void main(String[] args) throws Exception {

		File inputFile = new File("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\splitline.txt");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		String line;
		int lineNumber = 1;

		while ((line = reader.readLine()) != null) {
			lineNumber++;
			FileWriter writer = new FileWriter(
					"C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\AfterSpliteline" + lineNumber / 2 + ".txt", true);
			writer.write(line + "\n");
			if (lineNumber % 2 == 0) {
				writer.close();
			}
		}
		reader.close();
	}
}

class TestFileSplit {

	public static void main(String[] args) throws Exception {

		int count = 0;

		FileReader fileReader = new FileReader("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\splitline.txt");

		Scanner sc = new Scanner(fileReader);

		while (sc.hasNext()) {
			sc.nextLine();
			count++;
		}

		System.out.println("Lines in the file: " + count);

		int numberOfFiles = 0;

		numberOfFiles = (count + 1) / 2;

		System.out.println("Number of files to be generated : " + numberOfFiles);

		BufferedReader br = new BufferedReader(fileReader);

		for (int i = 1; i <= numberOfFiles; i++) {

			FileWriter fileWriter = new FileWriter("C:\\Users\\niraj\\OneDrrive\\Desktop\\IO\\AfterSplitFile" + i + ".txt");

			PrintWriter out = new PrintWriter(fileWriter);

			for (int j = 1; j <= 2; j++) {

				String line = br.readLine();

				if (line != null) {

					out.println(line);

				}
			}
			out.close();
		}
		fileReader.close();
	}
}