package Number_logic_questions;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nums = scan.nextInt();
		int temp = nums;
		int rev = 0;
		
		
		while(nums != 0) {
			rev = rev * 10 + nums % 10;
			nums = nums / 10;
		}	
		
		if(temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindorme");
		}
		
	}
}
