
package StringBuilder;

public class RemoveDuplicatesUsingIndexOf {

	public static void main(String[] args) {

		String str = "aabbcc";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (sb.indexOf(String.valueOf(ch)) == -1) {

				sb.append(ch);
			}
		}

		System.out.println("Original String: " + str);
		System.out.println("After Removing Duplicates: " + sb);
	}
}
