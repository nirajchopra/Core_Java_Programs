package StringsAndBuilt_inStringMethods;

public class CountWords {

	public static void main(String[] args) {
		String str = " I love Java ";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(' ' == ch) {
				count++;
			}
		}
		System.out.println("CountWords : " + count);

	}

}
