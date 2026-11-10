package StringsAndBuilt_inStringMethods;

public class CapitalizeEachWord {

	public static void main(String[] args) {

		String str = "hello java world";
//		String str = "jAVA";

		System.out.println("CapitalizeEachWord : " + capitalizeWords(str));
	}

	public static String capitalizeWords(String str) {

		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			String word = words[i].toLowerCase();

			if (!word.isEmpty()) {
				word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
			}

			result.append(word);

			if (i < words.length - 1) {
				result.append(" ");
			}
		}

		return result.toString();
	}
}
