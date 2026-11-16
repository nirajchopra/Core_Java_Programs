package Substring_Anagram_Palindrome_and_Parentheses;

public class LongestCommonPrefixOfTwoStrings {

	public static void main(String[] args) {
		String str = "dog";
		String target = "car";
		
		System.out.println("LongestCommonPrefixOfTwoStrings : " + longestCommonPrefixOfTwoString(str, target));

	}

	public static String longestCommonPrefixOfTwoString(String str, String target) {
		for (int i = 0; i < str.length(); i++) {
			if (!str.contains(target)) {
				return "(empty)";
			}
		}
		return target.toString();

	}

}
