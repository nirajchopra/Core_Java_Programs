package StringBuilder;

public class DeleteACharacterAtIndex {

	public static void main(String[] args) {
		String s = "hello";
		int index = 1;
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println("DeleteACharacterAtIndex : " + sb.deleteCharAt(index));

	}

}
