package com.rays.String;

public class CountAccuranceOfChar {
	public static void main(String[] args) {
		String name = "nirajchopra";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			String m = String.valueOf(ch);

			if (m.matches("a")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
