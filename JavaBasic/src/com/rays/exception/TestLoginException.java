package com.rays.exception;

public class TestLoginException {
	
	public static void main(String[] args) throws LoginException{
		
		System.out.println("Before");
		
		String name = "admin";
		
		try {
			if (name.equals("admin")) {
				System.out.println("valid user");
			} else {
				throw new LoginException("lll");
			}
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		System.out.println("After");
	}

}
