package Number_logic_questions;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int temp = 0;
        int num2 = num;
        int r = 0;
        int count = 0;

        // Count total digits
        int n = num;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        // Calculate Armstrong sum
        while (num2 != 0) {

            r = num2 % 10;
            temp = temp + (int) Math.pow(r, count);
            num2 = num2 / 10;

        }

        if (temp == num) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is Not Armstrong Number");
        }
	}

}
