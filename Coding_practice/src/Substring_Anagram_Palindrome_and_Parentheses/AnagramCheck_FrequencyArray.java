package Substring_Anagram_Palindrome_and_Parentheses;

import java.util.Arrays;

public class AnagramCheck_FrequencyArray {

	public static void main(String[] args) {
		String str1 = "triangle";
		String str2 = "integral";

		System.out.println("Anagram Check Freequency Array : " + anagramCheck_freq(str1, str2));

	}

	public static boolean anagramCheck_freq(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] arr = new int[26];

		for (int i = 0; i < str1.length(); i++) {

			arr[str1.charAt(i) - 'a']++;
			arr[str2.charAt(i) - 'a']--;
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				return false;
			}
		}

		return true;
	}

}
