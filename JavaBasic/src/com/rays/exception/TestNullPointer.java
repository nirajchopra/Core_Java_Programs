package com.rays.exception;

public class TestNullPointer {
	
	private static String name;

	public static void main(String[] args) {
		
		try {
			
			name = null;
			
			System.out.println("Length: " + name.length());
			
		} catch (Exception e) {
			
			System.out.println("Exception: " + e);
			
		}
	}

}
