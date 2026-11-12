package StringBuilder;

public class RemoveAllSpaces {

	public static void main(String[] args) {
		String s = "a b c";
		StringBuffer sb = new StringBuffer(s);

		for (int i = 0; i < sb.length(); i++) {

			if (sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
				i--;
			}
		}

		System.out.println("After Removing Spaces: " + sb);
	}

}
