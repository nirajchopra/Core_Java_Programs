package StringBuilder;

public class Append1ToN {

	public static void main(String[] args) {
		int n = 12;
		
		StringBuffer sb = new StringBuffer(n);
		
		for(int i=1; i<=n; i++) {
			sb.append(i);
		}
		
		System.out.println("Append1ToN : " + sb);

	}

}
