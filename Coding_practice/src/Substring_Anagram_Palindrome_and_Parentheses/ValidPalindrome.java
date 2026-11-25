package Substring_Anagram_Palindrome_and_Parentheses;

public class ValidPalindrome {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";

		System.out.println("Valid Palindrome : " + isPalindrome(str));

	}

	public static boolean isPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			if (!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}

			else if (!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			else {
				if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
					return false;
				}

				left++;
				right--;
			}
		}

		return true;
	}

}
