package StringsAndBuilt_inStringMethods;

public class CountSubstringOccurrences {

	public static void main(String[] args) {
		String str1 = "ababab";
		String str2 = "ab";

		System.out.println("CountSubstringOccurrences : " + countSubstring(str1, str2));

	}

	public static int countSubstring(String str1, String str2) {
		int count = 0;
		int index = 0;

		if (str2.isEmpty()) {
			return 0;
		}

		while ((index = str1.indexOf(str2, index)) != -1) {

			count++;
			index += str2.length();
		}

		return count;
	}

}
