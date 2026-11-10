package StringsAndBuilt_inStringMethods;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "I Love Java";
		String[] word = str.split(" ");

		System.out.print("ReverseEachWord : ");
		for (int i = 0; i < word.length; i++) {
			StringBuffer sb = new StringBuffer(word[i]);
			System.out.print(sb.reverse() + " ");
		}
	}

}
