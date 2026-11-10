package StringsAndBuilt_inStringMethods;

import java.util.Arrays;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		String str = "I Love Java";
		String[] word = str.split(" ");

		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}

	}

}
