package StringsAndBuilt_inStringMethods;

public class OnlyDigits {
	public static void main(String[] args) {
		String str = "123";
		System.out.println("Only Digits : " + onlyDigit(str));
	}

	public static boolean onlyDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
