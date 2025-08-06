package com.rays.exception;

public class MultiException {
	public static void main(String[] args) {
		String[] number = {"10", "0", "Niraj12"};
		for(String num : number) {
			try {
				int n = 10;
				int d = Integer.parseInt(num);
				int result = n/d;
			} catch (ArithmeticException | NumberFormatException e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
		}
	}

}
t4