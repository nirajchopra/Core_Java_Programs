package StringsAndBuilt_inStringMethods;

import java.util.HashMap;

public class RemoveAllVowels {

	public static void main(String[] args) {
		String str = "education";
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		System.out.print("RemoveAllVowels : ");

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!('A' == ch || 'E' == ch || 'I' == ch || 'O' == ch || 'U' == ch || 'a' == ch || 'e' == ch || 'i' == ch
					|| 'o' == ch || 'u' == ch)) {
				map.put(ch, "");
				System.out.print(ch);
			}
		}

	}

}
