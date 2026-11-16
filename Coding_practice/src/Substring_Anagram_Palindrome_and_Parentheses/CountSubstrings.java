package Substring_Anagram_Palindrome_and_Parentheses;

public class CountSubstrings {

	public static void main(String[] args) {
		String str = "abcd";

		System.out.println("Count substring : " + countSubstring(str));

	}

	public static int countSubstring(String str) {
		int count = 0;

		for (int i = 1; i <= str.length(); i++) {

			count += i;
		}

		return count;
	}

}
