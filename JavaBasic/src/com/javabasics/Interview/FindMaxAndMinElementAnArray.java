package Interview;

public class FindMaxAndMinElementAnArray {
	public static void main(String args[]) {
		int[] inputNumArray = { 12, 39, 1008, 127, 89, 2987, 16, 28, 123, 787, 54 };

		int maxNumber = inputNumArray[0];
		int minNumber = inputNumArray[0];

		for (int i = 0; i < inputNumArray.length; i++) {
			if (maxNumber < inputNumArray[i]) {
				maxNumber = inputNumArray[i];
			} else if (minNumber > inputNumArray[i]) {
				minNumber = inputNumArray[i];
			}
		}
		System.out.println("Largest number : " + maxNumber + "Smallest Number : " + minNumber);

	}
}
