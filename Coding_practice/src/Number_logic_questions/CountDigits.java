package Number_logic_questions;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nums = scan.nextInt();
		int count = 0;
		
		while(nums != 0) {
			int last = nums % 10;
			nums = nums / 10;
			
			count += 1;
		}
		
		System.out.print("Count Digit : " + count);
	}

}
