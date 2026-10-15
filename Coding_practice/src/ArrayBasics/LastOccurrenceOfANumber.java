package ArrayBasics;

public class LastOccurrenceOfANumber {

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,1};
		int key = 3;
		System.out.println("LastOccurrenceOfANumber : " + lastOccurence(arr, key));
	}
	
	public static int lastOccurence(int[] arr, int key) {
		int count = 0;
		
		for(int i=arr.length - 1; i>=0; i--) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
