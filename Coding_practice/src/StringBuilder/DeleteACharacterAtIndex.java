package StringBuilder;

public class DeleteACharacterAtIndex {

	public static void main(String[] args) {
		String s = "hello";
		int index = 1;
		
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println("DeleteACharacterAtIndex : " + sb.deleteCharAt(index));

	}

}
