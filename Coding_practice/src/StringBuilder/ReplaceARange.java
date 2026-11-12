package StringBuilder;

public class ReplaceARange {
	public static void main(String[] args) {
		String s = "I like Python";
		int startIndex = 7;
		int endIndex = 13;
		String newStr = "Java";

		StringBuffer sb = new StringBuffer(s);

		System.out.println("Replace A range : " + sb.replace(startIndex, endIndex, newStr));
	}

}
