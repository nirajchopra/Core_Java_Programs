package StringBuilder;

public class LengthAndCapacity {

	public static void main(String[] args) {
		String s = "";
		
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println(sb.length() + " " + sb.capacity());

	}

}
