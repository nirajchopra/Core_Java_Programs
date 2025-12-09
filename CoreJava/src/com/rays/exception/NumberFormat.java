package com.rays.exception;

public class NumberFormat {
	public static void main(String[] args) {
		String s = "Niraj123";
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
