package Number_logic_questions;

import java.util.Scanner;

public class PrimesInRange {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {

            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        scan.close();
	}
}
