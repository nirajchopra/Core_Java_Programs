package StringBuilder;

public class AddCommasToANumber {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("123456789");

		for (int i = sb.length() - 3; i > 0; i -= 3) {

			sb.insert(i, ',');
		}

		System.out.println("Number with commas: " + sb);
	}

}
