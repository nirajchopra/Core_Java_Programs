package Substring_Anagram_Palindrome_and_Parentheses;

public class LongestCommonPrefixOfAnArray {

	public static void main(String[] args) {
		String[] word = { "flower", "flow", "flight" };

		System.out.println("LongestCommonPrefixOfAnArray : " + longestCommonPrefixOfAnArray(word));

	}

	public static String longestCommonPrefixOfAnArray(String[] word) {
		if (word == null || word.length == 0) {
			return "";
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < word[0].length(); i++) {

			char ch = word[0].charAt(i);

			for (int j = 1; j < word.length; j++) {

				if (i >= word[j].length() || word[j].charAt(i) != ch) {
					return sb.toString();
				}
			}

			sb.append(ch);
		}

		return sb.toString();
	}

}
