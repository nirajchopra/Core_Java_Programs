package Number_logic_questions;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nums = scan.nextInt();
		int sum = 0;

		while(nums != 0) {
			int last = nums % 10;
			nums= nums / 10;
			sum += last;
		}
		System.out.print("Sum of Digits : " + sum);
	}

}
