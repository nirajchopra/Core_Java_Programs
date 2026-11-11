package StringsAndBuilt_inStringMethods;

public class StringCompression {

	public static void main(String[] args) {
		String str = "aaabbc";
		
		stringCompression(str);
	}

	public static void stringCompression(String str) {
		int[] freq = new int[26];

		// Step 1: Count character frequency
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			freq[ch - 'a']++;
		}

		System.out.print("StringCompression : ");

		// Step 2: Print characters in alphabetical order
		for (int i = 0; i < 26; i++) {

			if (freq[i] > 0) {

				char ch = (char) (i + 'a');

				System.out.print(ch + "" +  freq[i] + "");
			}
		}
	}

}
