package StringBuilder;


public class ReverseUsingStringBuilder {

	public static void main(String[] args) {
		String s = "hello";
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println("ReverseUsingStringBuilder : " + sb.reverse());

	}

}
