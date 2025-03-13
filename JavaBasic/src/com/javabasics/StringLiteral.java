package com.javabasics;

public class StringLiteral {
	public static void main(String[] args) {
		
		
		   String s2 = "abc";
		   String s3 = "abc123@$";
		   String s4 = "H1 I am in Jtc";
		   String s5 = "Hello \t Welcome to Jtc";
		   String s6 = "Hello \r NA";
		   // String s7 = """; -> not ok
		   // String s8 = "\u0022"; -> not ok
		   String s9 = "\"";
		   String s10 = \u0022 Hello String literal \u0022;
		   // String s11 = "\u0022\u0022; -> not ok
		   String s12 = "C:\\program\\java\\jdk\\bin";
		   // String s13 = "C:\program\java\jdk\bin"; -> not ok
		   String s14 = "";
		   String s15 = 515 + "Hello";
		   String s16 = "\u0001";
		   String s17 = " "; // -> tab is ok
		   String s18 = "	 "; // -> tab & space ok
		   // String s19 = ""Hello""; -> not ok
		   // String s20 = ""String""; -> not ok
		   String s22 = " ";// -> space is ok
		   
		   
		   System.out.println("m1 in Hello");
	       System.out.println(s2);
	       System.out.println(s3);
	       System.out.println(s4);
	       System.out.println(s5);
	       System.out.println(s6);
	       System.out.println(s9);
	       System.out.println(s10);
	       System.out.println(s12);
	       System.out.println(s14);
	       System.out.println(s15);
	       System.out.println(s16);
	       System.out.println(s17);
	       System.out.println(s18);
	       System.out.println(s22);
	}

}
