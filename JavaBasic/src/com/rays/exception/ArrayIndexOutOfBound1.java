package com.rays.exception;

public class ArrayIndexOutOfBound1 {
	public static void main(String args[]) {
		String[] a = {"Niraj", "Aryan", "Anand"};
		try {
//			System.out.println(a[2]);
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
