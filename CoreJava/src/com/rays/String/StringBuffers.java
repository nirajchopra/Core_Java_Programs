package com.rays.String;

public class StringBuffers {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Vijay");
		sb.append(" Dinanth Chouhan");
		System.out.println("Length: " + sb.length());
		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Char at: " + sb.charAt(1));
		System.out.print("Index of: " + sb.indexOf("Dinanath"));
		System.out.println("Replace: " + sb.replace(0, 5, "jay"));
		System.out.println("Reverse: " + sb.reverse());

		// StringBuffer sb = new StringBuffer("This is Java");
		// sb.append(",Java is OOP");
		// sb.append(",Java is promising language for Job.");
		// System.out.println(sb);

	}

}
