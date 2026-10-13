package Number_logic_questions;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Strong Number : ");
		int num = scan.nextInt();
		int temp = num;
		int sum = 0;
		

		while (num != 0) {
			int rev = num % 10;
			num = num / 10;
			
			int fact = 1;

			for (int i = 1; i <= rev; i++) {

				fact *= i;

			}

			sum += fact;

		}

		if (sum == temp) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
