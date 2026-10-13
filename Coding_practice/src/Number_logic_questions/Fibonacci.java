package Number_logic_questions;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Fibonacci : ");
		for(int i=0; i<=n; i++) {
			c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
	}

}
