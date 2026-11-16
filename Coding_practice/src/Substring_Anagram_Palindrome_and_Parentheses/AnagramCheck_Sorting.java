package Substring_Anagram_Palindrome_and_Parentheses;

import java.util.Arrays;

public class AnagramCheck_Sorting {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		System.out.println("Anagram Check : " + anagramCheck(str1, str2));

	}

	public static boolean anagramCheck(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);

	}
}
