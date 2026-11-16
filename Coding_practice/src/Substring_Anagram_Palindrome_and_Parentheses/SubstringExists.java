package Substring_Anagram_Palindrome_and_Parentheses;

public class SubstringExists {

	public static void main(String[] args) {
		String str = "hello world";
		String target = "o w";

		System.out.println("SubstringExists : " + substringExists(str, target));

	}

	public static boolean substringExists(String str, String target) {
		for (int i = 0; i < str.length(); i++) {

			if (str.contains(target)) {
				return true;
			}
		}
		return false;
	}

}
