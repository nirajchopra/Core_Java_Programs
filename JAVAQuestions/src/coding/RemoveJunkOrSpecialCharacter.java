package coding;

import java.util.Scanner;

public class RemoveJunkOrSpecialCharacter {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String s = scan.nextLine();
		
		//Regular Expression : [^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Remove Special Character : " + s);
	}

}
