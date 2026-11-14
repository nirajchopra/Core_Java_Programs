package StringBuilder;

public class Run_LengthDecode {

	public static void main(String[] args) {

		String str = "a3b2c1";

		System.out.println("Run_Length Decode: " + runLengthDecode(str));
	}

	public static String runLengthDecode(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length();) {

			char ch = str.charAt(i);
			i++;

			int count = 0;

			while (i < str.length() && Character.isDigit(str.charAt(i))) {

				count = count * 10 + (str.charAt(i) - '0');
				i++;
			}

			for (int j = 0; j < count; j++) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}