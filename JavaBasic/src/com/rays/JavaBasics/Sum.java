package com.rays;

public class Sum {
	public static void main(String args[]) {
		int num = 0;
		for(int i = 100; i<200; i++) {
			if(i%7==0) {
				num = num + i;
			}
		}
		System.out.println(num);
	}

}
