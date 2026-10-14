package Number_logic_questions;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		// for operator
		a = a + b;
		b = a - b;
		a = a - b;
		
		// for XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
