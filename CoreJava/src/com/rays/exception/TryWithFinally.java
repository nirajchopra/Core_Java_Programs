package com.rays.exception;

public class TryWithFinally {
	public static void main(String args[]) {
		String s = "Niraj";
		try {
			System.out.println(s.charAt(10));
			System.out.println("Try");
		} finally {
			System.out.println("End of program");
		}
	}

}
