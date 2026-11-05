package StringsAndBuilt_inStringMethods;

public class ToggleCase {

	public static void main(String[] args) {
		String str = "abc123";

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			} else {
				result.append(ch);
			}
		}
		System.out.println("ToggleCase : " + result.toString());
	}

}
