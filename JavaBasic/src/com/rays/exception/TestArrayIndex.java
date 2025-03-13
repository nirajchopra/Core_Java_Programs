package com.rays.exception;

public class TestArrayIndex {
	
	public static void main(String[] args) {
		
		try {
			
			int [] arr = {1,2,3,4,5,6};
			
			System.out.println("arr: " + arr[7]);
			
		}catch (Exception e) {
			
			System.out.println("exception: " + e );
			
		}
	}

}
