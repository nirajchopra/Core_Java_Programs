package StringBuilder;

public class PalindromeUsingReverseMethod {

	public static void main(String[] args) {
		String str = "level";

		System.out.println("PalindromeUsingReverseMethod : " + palindrome(str));

	}

	public static boolean palindrome(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {
			String reverse = sb.reverse().toString();

			if (reverse.equals(str)) {
				return true;
			}
		}
		return false;
	}

}
