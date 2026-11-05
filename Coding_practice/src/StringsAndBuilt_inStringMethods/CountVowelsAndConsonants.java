package StringsAndBuilt_inStringMethods;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String str = "Hello World";
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ('A' == ch || 'E' == ch || 'I' == ch || 'O' == ch || 'U' == ch || 'a' == ch || 'e' == ch || 'i' == ch
					|| 'o' == ch || 'u' == ch) {
				vowels++;
			} else {
				consonants++;
			}
		}

		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);

	}

}
