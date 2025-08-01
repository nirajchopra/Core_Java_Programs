package com.rays.exception;

public class TryCatchFinally {
	public static void mian(String args[]) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			System.out.println("This is Finally Block");
		}
	}

}
