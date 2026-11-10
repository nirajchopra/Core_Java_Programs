package StringsAndBuilt_inStringMethods;

public class LongestWord {

	public static void main(String[] args) {
		String str = "I love programming in Java";

		String[] words = str.split("\\s+");

		String longest = "";

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}

		System.out.println("Longest Word: " + longest);
	}

}
