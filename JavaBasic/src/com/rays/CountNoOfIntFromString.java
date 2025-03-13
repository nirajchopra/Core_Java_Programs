package com.rays;

public class CountNoOfIntFromString {
	public static void main(String[] args) {
		String name = "abc12345de789";
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			if(Character.isDigit(name.charAt(i))) {
				count++;
			}
		}
		System.out.println("Number of Int: "+count);
	}

}
