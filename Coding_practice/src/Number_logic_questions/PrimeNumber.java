package Number_logic_questions;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nums = scan.nextInt();
		int count = 0;
		
		for(int i=2; i<nums; i++) {
			if(nums % i == 0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
