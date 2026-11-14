package StringBuilder;

public class AddCommasToANumber {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("123456789");

		for (int i = sb.length() - 3; i > 0; i -= 3) {

			sb.insert(i, ',');
		}

		System.out.println("Number with commas: " + sb);
	}

}
