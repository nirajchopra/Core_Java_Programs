package StringsAndBuilt_inStringMethods;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam";
		System.out.println("Palindrome String : " + palindromeString(str));
	}

	public static boolean palindromeString(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

}
