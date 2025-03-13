package com.rays.exception;

public class TestArithmetic {
	
	public static void main(String[] args) {
		
		 System.out.println("Before");
		 
		 try {
			 
			 int a = 46;
			 int b = 0;
			 int c = a/b;
			 
			 System.out.println("sum: " + c);
			 
		 }catch(Exception e) {
			 
			 System.out.println("Exception: " + e.getMessage());
			 
		 }
		 
		 System.out.println("After");
	}

}
