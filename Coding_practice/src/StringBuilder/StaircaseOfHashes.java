package StringBuilder;

public class StaircaseOfHashes {

	public static void main(String[] args) {
		int n = 3;
		StringBuilder sb = new StringBuilder(n);
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("# ");
			}
			
			System.out.println();
		}
		
	}

}
