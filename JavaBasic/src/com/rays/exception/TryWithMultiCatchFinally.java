package com.rays.exception;

public class TryWithMultiCatchFinally {
	public static void main(String args[]) {
		String name1 = "abc";
		String name2 = null;
		
		try {
			System.out.println(name2.length());
			System.out.println(name1.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (StringIndexOutOfBoundsException s) {
			// TODO: handle exception
			System.out.println(s);
		} finally {
			System.out.println("Finally");
		}
	}

}
