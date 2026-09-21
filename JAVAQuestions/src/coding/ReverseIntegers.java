package coding;

import java.util.Scanner;

public class ReverseIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1. Using algorithm
		
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse an Integer using Algorithm : " + rev);
		
		//2. Using StringBuffer
		System.out.print("Enter a number : ");
		int num1 = scan.nextInt();
		System.out.println("Reverse an Integer using StringBuffer : " + new StringBuffer(String.valueOf(num1)).reverse());
	}

}
