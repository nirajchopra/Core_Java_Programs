package StringsAndBuilt_inStringMethods;

import java.util.HashSet;

public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		String str = "abcba";
		
		System.out.print("FirstRepeatedCharacter : ");

		firstRepeatedCharacter(str);

	}

	public static void firstRepeatedCharacter(String str) {
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (set.contains(ch)) {
				System.out.println(ch);
				return;
			}

			set.add(ch);
		}

		System.out.println("None");

	}

}
