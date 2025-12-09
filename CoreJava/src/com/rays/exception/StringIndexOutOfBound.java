package com.rays.exception;

public class StringIndexOutOfBound {
	public static void main(String args[]) {
		String s = "Niraj";
		try {
			System.out.println(s.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
