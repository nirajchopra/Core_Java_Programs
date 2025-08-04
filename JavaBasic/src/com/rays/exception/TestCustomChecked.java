package com.rays.exception;

public class TestCustomChecked {
	public static void main(String[] args) {
		
		try {
			dad();
		} catch (CustomChecked e) {
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	public static void dad() throws CustomChecked {
		mom();
		
	}
	public static void mom() throws CustomChecked {
		son();
		
	}
	
	public static void son() throws CustomChecked{
		CustomChecked e = new CustomChecked();
		throw e;
	}

}
