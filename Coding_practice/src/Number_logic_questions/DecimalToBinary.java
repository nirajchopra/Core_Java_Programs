package Number_logic_questions;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		//1. Approach with Integer.toBinaryString()
//		
//		String binary = Integer.toBinaryString(n);
//		
//		System.out.println(binary);

		if(num == 0) {
			System.out.println(0);
		}
		
		int binary = 0;
		int place = 1;
		
		while(num > 0) {
			int digit = num % 2;
			
			binary = binary + (digit * place);
			
			place = place * 10;
			
			num = num / 2;
			
		}
		
		System.out.println(binary);
		
	}

}
