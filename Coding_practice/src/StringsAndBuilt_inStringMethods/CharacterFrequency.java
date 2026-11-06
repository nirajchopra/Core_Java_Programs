package StringsAndBuilt_inStringMethods;

public class CharacterFrequency {

	public static void main(String[] args) {

		String str = "banana";

		int[] freq = new int[26];

		// Step 1: Count character frequency
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			freq[ch - 'a']++;
		}

		System.out.print("CharacterFrequency : ");

		// Step 2: Print characters in alphabetical order
		for (int i = 0; i < 26; i++) {

			if (freq[i] > 0) {

				char ch = (char) (i + 'a');

				System.out.print(ch + ":" + freq[i] + " ");
			}
		}
	}
}