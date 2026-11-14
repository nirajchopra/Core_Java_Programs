package StringBuilder;

public class ReverseWordsUsingStringBuilder {

	public static void main(String[] args) {
		String str = "I love Java";
		String[] word = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = word.length - 1; i >= 0; i--) {

			sb.append(word[i]).append(" ");
		}

		System.out.println(sb.toString().trim());

	}

}
