package StringsAndBuilt_inStringMethods;

import java.util.HashMap;

public class MostFrequentCharacter {

	public static void main(String[] args) {

		String s = "success";

		System.out.print("MostFrequentCharacter : ");
		mostfreq(s);
	}

	public static void mostfreq(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		char maxChar = '\0';
		int maxCount = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);

			if (map.get(ch) > maxCount) {
				maxCount = map.get(ch);
				maxChar = ch;
			}
		}

		if (maxCount > 0) {
			System.out.println(maxChar + " = " + maxCount);
		} else {
			System.out.println("None");
		}
	}
}