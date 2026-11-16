package Substring_Anagram_Palindrome_and_Parentheses;

public class PrintAllSubstrings {
	public static void main(String[] args) {
		String str = "abc";

		for (int i = 0; i < str.length(); i++) {

			StringBuilder sb = new StringBuilder();

			for (int j = i; j < str.length(); j++) {

				sb.append(str.charAt(j));

				System.out.println(sb);
			}
		}
	}

}
