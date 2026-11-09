package StringsAndBuilt_inStringMethods;

public class ReplaceSpacesWith_Percentage20 {

	public static void main(String[] args) {

		String str = "a b c";
//		String str = "hello";
		
		System.out.print("ReplaceSpacesWith_Percentage20 : ");

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {

			char ch = sb.charAt(i);

			if (ch == ' ') {
				sb.replace(i, i + 1, "%20");
				i += 2;
			}
		}

		System.out.println(sb.toString());
	}
}