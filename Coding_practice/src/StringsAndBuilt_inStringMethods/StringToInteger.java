package StringsAndBuilt_inStringMethods;

public class StringToInteger {

	public static void main(String[] args) {

		String str = "12345";

		int result = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			int digit = ch - '0';

			result = result * 10 + digit;
		}

		System.out.println("Integer: " + result);
	}
}
