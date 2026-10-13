package Number_logic_questions;

import java.util.Scanner;

public class PowerWithoutMathPow {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.print("Enter the power : ");
		int pow = sc.nextInt();
		
		int result = 1;
		
		for(int i=1; i<=pow; i++) {
				result *= num;
		}
		System.out.println("Power without Math.pow : " + result);

	}

}
