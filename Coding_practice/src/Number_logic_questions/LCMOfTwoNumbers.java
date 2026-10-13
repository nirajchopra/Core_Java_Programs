package Number_logic_questions;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int lcm = 1;
		int gcd =gcd(a, b);
		
		for(int i=1; i<a; i++) {
			lcm = (a * b) / gcd;
		}
		System.out.println("LCM of two Numbers : " + lcm);

	}
	
	    public static int gcd(int a, int b) {
		Scanner scan = new Scanner(System.in);
		int gcd = 1;
		
			for(int i=1; i<a; i++) {
				if(a % i == 0 && b % i == 0) {
					gcd = i;
				}
			}
		
		return gcd;
	}

}
