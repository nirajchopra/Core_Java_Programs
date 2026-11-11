package StringsAndBuilt_inStringMethods;

public class CountCharacter {

	public static void main(String[] args) {
		String s = "mississippi";
		char target = 'p';

		System.out.println("CountCharacter : " + countCharacter(s, target));

	}

	public static int countCharacter(String s, char target) {
		int count = 0;

		if (target == ' ') {
			return 0;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == target) {
				count++;
			}
		}
		return count;
	}

}
