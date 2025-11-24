package com.rays.io.interview;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadAndWriteDataFromKeyboard {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Yeh keyboard (System.in) se text read karne ke liye reader banata hai.

		FileWriter fw = new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\niraj.txt", true);
		// Yeh file ko write mode me kholta hai (true = purani file me new lines add hongi).

		System.out.println("enter here.....");
		// User ko message deta hai: "Type karo!"

		String str = br.readLine();
		// User jo bhi likhega, uski ek line read karta hai.

		while (str != null) {
			// Jab tak user kuch na likhe (null na mile), tab tak loop chalti rahe.

			fw.write(str);
			// User ka likha hua text file me save kar deta hai.

			System.out.println(str);
			// Jo user ne likha, woh screen par dubara print karta hai.

			str = br.readLine();
			// User se next line input leta hai.
		}

		br.close();
		// Keyboard reader close karta hai.
		fw.close();
	}

}

class ReadWriteFromKeyboard{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\niraj.txt", true);

        System.out.println("Enter text (type 'exit' to stop):");

        String str = br.readLine();

        while (!str.equalsIgnoreCase("exit")) {

            fw.write(str + "\n");  // NEW LINE bhi add karo
            fw.flush();            // immediate write karne ke liye

            System.out.println("Saved: " + str);

            str = br.readLine();
        }

        br.close();
        fw.close();
        System.out.println("File saved successfully!");
	}
}

class TestReadByKeyBoard {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in  = new BufferedReader(isReader);
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\niraj\\OneDrive\\Desktop\\IO\\niraj.txt",true));
		
		String line = in.readLine();
		while (!(line.equals("bye"))) {
			out.print(line);
			line = in.readLine();			
		}
		
		out.close();
		in.close();
	}
}

