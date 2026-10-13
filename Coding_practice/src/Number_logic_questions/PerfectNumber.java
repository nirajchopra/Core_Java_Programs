package Number_logic_questions;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Perfect Number : ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<num - 1; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		if(sum == num) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
