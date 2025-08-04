package com.rays.exception;

public class TestCustomUnchecked {
	
	public static void main(String[] args) {
		
		try {
			dad();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
	}
	public static void dad() {
		mom();
		
	}
	public static void mom() {
		son();
		
	}
	public static void son() {
		
		CustomUnchecked e = new CustomUnchecked();
		
		throw e;
	}

}
