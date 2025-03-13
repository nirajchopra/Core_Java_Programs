package com.rays;

public class FindMissingNumber {
	public static void main(String args[]) {
		int a [] = {20,10,50,60};
		int b [] = {20,10,50,60,70};
		
		int suma = 0;
		int sumb = 0;
		
		for (int i = 0; i < a.length; i++) {
			suma = suma + a[i];
		}
		for (int j = 0; j < b.length; j++) {
			sumb = sumb + b[j];
		}
		System.out.println(sumb - suma);
	}

}
