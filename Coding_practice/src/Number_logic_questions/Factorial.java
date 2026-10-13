package Number_logic_questions;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nums = scan.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=nums; i++) {
			fact = fact * i;
		}
		System.out.print("Factorial : "+ fact);
	}

}
