package com.rays.exception;

public class TestSubtract {
	public static void main(String[] args) {
		
		try {
			
			int a = 0;
			int b = 20;
			int diff =  a-b;
			
			System.out.println("subtract : " + diff);
			
		} catch (Exception e) {
			
			System.out.println("Exception: " + e);
			
		}
	}

}
