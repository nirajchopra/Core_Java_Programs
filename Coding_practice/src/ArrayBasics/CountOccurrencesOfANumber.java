package ArrayBasics;

public class CountOccurrencesOfANumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,1,3,1};
		int key = 1;
		
		int count =0 ;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				count++;
			}
		}
		
		System.out.println("CountOccurrencesOfANumber : " + count);

	}

}
