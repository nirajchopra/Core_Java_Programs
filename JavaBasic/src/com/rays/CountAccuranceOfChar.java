package com.rays;

public class CountAccuranceOfChar {
	public static void main(String[] args) {
		String name = "chopra";
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			String m = String.valueOf(ch);
			
			if (m.matches("o")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
