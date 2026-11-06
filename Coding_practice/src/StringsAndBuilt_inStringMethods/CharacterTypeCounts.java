package StringsAndBuilt_inStringMethods;

public class CharacterTypeCounts {

	public static void main(String[] args) {
		String str = "Java@2024";

		int lower = 0;
		int upper = 0;
		int digit = 0;
		int special = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {
				lower++;
			} else if (Character.isUpperCase(ch)) {
				upper++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				special++;
			}
		}

		System.out.println("Lower : " + lower);
		System.out.println("Upper  : " + upper);
		System.out.println("Digit : " + digit);
		System.out.println("Special : " + special);
	}

}
