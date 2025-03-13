package com.rays.exception;

public class TestPropagation {
	public static void main(String[] args) {
		
		Propagation p = new Propagation();
		
		try {
			Propagation test = null;
			test.first();
			
		} catch (Exception e) {
			System.out.println("Exception caught is main()" + e.getMessage());
		}
	}

}
