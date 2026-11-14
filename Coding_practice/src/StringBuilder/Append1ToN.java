package StringBuilder;

public class Append1ToN {

	public static void main(String[] args) {
		int n = 12;
		
		StringBuilder sb = new StringBuilder(n);
		
		for(int i=1; i<=n; i++) {
			sb.append(i);
		}
		
		System.out.println("Append1ToN : " + sb);

	}

}
