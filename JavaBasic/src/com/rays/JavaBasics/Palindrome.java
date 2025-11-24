package com.rays;

public class Palindrome {
	public static void main(String args[]) {
		int num = 15251;
		int temp = num ;
		int sum =0;
		while(num > 0) {
			int rem = num%10;
			 sum = (sum*10)+rem;
			num = num/10;
		}
		System.out.println(sum);
		if (sum==temp) {
			System .out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
