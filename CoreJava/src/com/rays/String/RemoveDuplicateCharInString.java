package com.rays.String;

public class RemoveDuplicateCharInString {
	public static void main(String[] args) {
		String name1 = "Chopra";
		String name = name1.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int dup = name.indexOf(ch, i + 1);
			if (dup == -1) {
				System.out.print(ch);
			}
		}
		char[] ch1 = name.toCharArray();
		for (char ch : ch1) {
			System.out.println(ch + " " + (int) ch);
		}
	}

}
