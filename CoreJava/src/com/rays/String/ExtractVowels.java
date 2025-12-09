package com.rays.String;

public class ExtractVowels {
	public static void main(String[] args) {
		String str = "OOUOTFYTDZESXkhiuiopihutigda";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if ("aeiuoAEIOU".indexOf(c) != -1) {
				System.out.print(c + " ");
			}

		}
		System.out.println(count);
	}

}
