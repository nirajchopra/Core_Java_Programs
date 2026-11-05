package StringsAndBuilt_inStringMethods;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "java";
		System.out.print("ReverseAString : ");
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}

	}

}
