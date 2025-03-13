package com.rays;

public class SwitchCases {
	public static void main(String args[]) {
		String name = "Niraj";
		
		switch (name) {
		case "Niraj":
			System.out.println("Name");
			break;
		case "Chopra":
			System.out.println("Surname");
			break;
		case "Rahadkot":
			System.out.println("Village");
			break;
			default:
				System.out.println("Nothing else");
				break;
		}
	}

}
