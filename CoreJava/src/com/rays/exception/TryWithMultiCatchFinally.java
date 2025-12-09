package com.rays.exception;

public class TryWithMultiCatchFinally {
	public static void main(String args[]) {
		String name1 = null;
		String name2 = "abc";
		
		try {
			System.out.println(name1.length());
			System.out.println(name2.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
			System.exit(0);
		} catch (StringIndexOutOfBoundsException s) {
			// TODO: handle exception
			System.out.println(s);
		} finally {
			System.out.println("Finally");
		}
	}

}
