package Matrix_2D;

public class SearchInRow_ColumnSortedMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int target = 5;
		System.out.println("SearchInRow_ColumnSortedMatrix : " + search(arr, target));
	}
	
	public static boolean search(int[][] arr, int target) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		int i =0 ;
		int j = cols-1;
		
		while(i<rows && j>=0) {
			if(arr[i][j] == target) {
				return true;
			} else if(arr[i][j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

}
