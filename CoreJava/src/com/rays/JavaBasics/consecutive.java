package com.rays.JavaBasics;

public class consecutive {
	public static void main(String args[]) {
		int n = 5;
		int oddsum = 0;
		int count1 = 0;
		int count2 = 0;
		int evensum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				count1++;
				oddsum = oddsum + i;
			} else {
				count2++;
				evensum = evensum + i;
			}

		}
		System.out.println("the average of consecutive odd no is " + (oddsum / count1));
		System.out.println("the average of consecutive even no is " + (evensum / count2));

	}

}
