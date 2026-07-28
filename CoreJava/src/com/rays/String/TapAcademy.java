package com.rays.String;

import java.util.Scanner;

public class TapAcademy {
	public static void main(String[] args) {
		
//		String s1 = "TAP";
//		System.out.println(s1);
//		
//		s1=s1.concat("ACADEMY");
//		System.out.println(s1);
		
//		StringBuilder st = new StringBuilder();
//		StringBuffer sb=new StringBuffer();
//		System.out.println(st.capacity());//16 capacity
//		//StringBuffer and StringBuilder have 16 location in java.
//		//formula of capacity = current_capacity * 2 + 2
//		st.append("JAVA ");
//		st.append("JAVASCRIPT ");
//		st.append("JAMESGOSLING");
//		st.delete(1, 10);
//		System.out.println(st.capacity());//34 capacity
//		System.out.println(st);
		
//		//Boolean and String 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the boolean");
//		boolean a = scan.nextBoolean();
//		scan.nextLine();
//		System.out.println("Enter the String");
//		String b = scan.nextLine();
//		
//		System.out.println("Boolean: " + a);
//		System.out.println("String: " + b);
		
		//String and Boolean
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = scan.nextLine();
		System.out.println("Enter the Boolean");
		boolean b = scan.nextBoolean();
		
		System.out.println("String : " + a);
		System.out.println("Boolean : " + b);
		
		
	}

}
