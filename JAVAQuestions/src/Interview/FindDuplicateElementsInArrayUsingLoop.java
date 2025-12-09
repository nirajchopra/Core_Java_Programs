package Interview;

public class FindDuplicateElementsInArrayUsingLoop {
	public static void main(String args[]){
		int[] inputNumArray = {10, 5, 10, 43, 53, 90, 43, 70, 100, 102, 100};
		
		for(int i=0; i<inputNumArray.length; i++){
			for(int j=i+1; j<inputNumArray.length; j++){
				if(inputNumArray[i] == inputNumArray[j]){
					System.out.println("Duplicate Element found : " + inputNumArray[i]);
				}
			}
		}
	}
}
