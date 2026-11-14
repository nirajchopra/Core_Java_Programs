package StringBuilder;


public class ReverseUsingStringBuilder {

	public static void main(String[] args) {
		String s = "hello";
		
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println("ReverseUsingStringBuilder : " + sb.reverse());

	}

}
