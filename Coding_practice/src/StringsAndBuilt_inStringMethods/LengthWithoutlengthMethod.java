package StringsAndBuilt_inStringMethods;

public class LengthWithoutlengthMethod {
	public static void main(String[] args) {
		String str = "hello";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			count++;
		}
		System.out.println( "LengthWithoutlengthMethod : " + count);
	}
}

