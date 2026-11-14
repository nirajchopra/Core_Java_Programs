package StringBuilder;

import java.util.Scanner;

public class ReplaceACharacterWith_setCharAt {

	public static void main(String[] args) {
		String str = "banana";
		System.out.println("Replace a Character With setCharAt : " + replaceCharacter(str));

	}

	public static String replaceCharacter(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {

			if (sb.charAt(i) == 'a') {
				sb.setCharAt(i, 'o');
			}
		}

		return sb.toString();
	}

}
