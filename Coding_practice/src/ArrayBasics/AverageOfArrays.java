package ArrayBasics;

public class AverageOfArrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		System.out.println("AverageOfArrays : " + avgOfArray(arr));

	}
	
	public static double avgOfArray(int[] arr) {
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		
		double avg = (double)sum / arr.length;
		return avg;
	}
	

}
