package com.rays.String;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("JAVA PYTHIN SQL AI ML" , " ");
		
//		st.hasMoreTokens();
//		System.out.println(st.nextToken());
//		
//		st.hasMoreTokens();
//		System.out.println(st.nextToken());
//		
//		st.hasMoreTokens();
//		System.out.println(st.nextToken());
//		
//		st.hasMoreTokens();
//		System.out.println(st.nextToken());
//		
//		st.hasMoreTokens();
//		System.out.println(st.nextToken());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
