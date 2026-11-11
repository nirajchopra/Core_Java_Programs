package StringsAndBuilt_inStringMethods;

public class CompareWithoutEqualsMethod {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "abc";

		System.out.println("CompareWithoutEqualsMethod : " + compareWithoutEqualsMthod(s1, s2));

	}

	public static boolean compareWithoutEqualsMthod(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		if (s1.contains(s2)) {
			return true;
		}
		return false;
	}

}
