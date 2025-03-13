package com.rays;

public class ArmstrongNumber {
	public static void main(String[] args) {
/*An Armstrong number (also known as narcissistic number or plenary number)
 * is a number that is equal to the sum of its own digit raised to the power of
 * the number of digits.
 */
		int num = 371;
		int temp = 0;
		int num2 = num;
		int r = 0;

		while (num2 != 0) {

			r = num2 % 10;
			temp = temp + r * r * r;
			num2 = num2 / 10;

		}

		if (temp == num) {

			System.out.println("ArmStrongNo");

		} else {
			System.out.println("Not ArmStrongNo");
		}

	}

}
