package com.rays;

public class ExtractInt {
	public static void main(String[] args) {
		String str = "k5454hghjh4";

		int[] s = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				s[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

			}

		}
		System.out.println(s[3]);

	}

}
