package StringBuilder;

public class InsertACharacter {

	public static void main(String[] args) {
		String s = "helo";
		int index = 3;
		char ch = 'l';

		StringBuilder sb = new StringBuilder(s);

		System.out.println("InsertACharacter : " + sb.insert(index, ch));
	}

}
