package coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		/*
		 * Reverse in String :
		 * Different between String and StringBuffer ? 
		 * Do we have reverse() functtion in String ?
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = scan.nextLine();

		// 1. using for loop

		int len = s.length(); // 8
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev += s.charAt(i);// muineleS
		}
		System.out.println("Reverse String using for loop : " + rev);

		// 2. using StringBuffer class

		StringBuffer bf = new StringBuffer(s);
		System.out.println("Reverse String using StringBuffer class : " + bf.reverse());
	}

}
