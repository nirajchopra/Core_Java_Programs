package Number_logic_questions;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		int decimal = 0;
		int base = 1;

		while (binary > 0) {
			int digit = binary % 10;

			decimal = decimal + (digit * base);

			base = base * 2;

			binary = binary / 10;
		}
		System.out.println(decimal);

	}

}
