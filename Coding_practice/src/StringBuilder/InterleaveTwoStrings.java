package StringBuilder;

public class InterleaveTwoStrings {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "123";

		StringBuilder sb = new StringBuilder();

		int maxLength = Math.max(str1.length(), str2.length());

		for (int i = 0; i < maxLength; i++) {

			if (i < str1.length()) {
				sb.append(str1.charAt(i));
			}

			if (i < str2.length()) {
				sb.append(str2.charAt(i));
			}
		}

		System.out.println("InterleaveTwoStrings : " + sb.toString());
	}
}
