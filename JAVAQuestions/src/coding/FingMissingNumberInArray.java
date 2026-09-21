package coding;

public class FingMissingNumberInArray {

	public static void main(String[] args) {
		
		//int a[] = {1,2,4,5, 6, 7, ..........., 100};
		//1 + 2 + 4 + 5 = 12
		//1 + 2 + 3 + 4 + 5 = 15
		//15 - 12 = 3
		
		int a[] = {1,2,4,5};
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		System.out.println("Misssing Number is : " + sum);

	}

}
