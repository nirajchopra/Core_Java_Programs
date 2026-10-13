package Number_logic_questions;

import java.util.Scanner;

public class GCDOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gcd = 1;
		
			for(int i=1; i<a; i++) {
				if(a % i == 0 && b % i == 0) {
					gcd = i;
				}
			}
		
		System.out.println(gcd);
	}
}
