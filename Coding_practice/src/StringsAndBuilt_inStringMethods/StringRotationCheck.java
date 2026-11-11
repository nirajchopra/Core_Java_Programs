package StringsAndBuilt_inStringMethods;

public class StringRotationCheck {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "cdab";

		System.out.println("StringRotationCheck : " + rotateString(str1, str2));

	}

	public static boolean rotateString(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		String str = str1.concat(str1);

		return str.contains(str2);
	}

}
