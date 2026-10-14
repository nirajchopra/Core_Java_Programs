package Number_logic_questions;

import java.util.Scanner;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int count = 0;

		while (num != 0) {
			num = num / 5;

			count += num;
		}

		System.out.println("Trailing Zeros In Factorial : " + count);
	}

}
