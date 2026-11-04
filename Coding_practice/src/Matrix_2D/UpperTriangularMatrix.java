package Matrix_2D;

public class UpperTriangularMatrix {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };

        System.out.println(upperTriangularMatrix(arr));
    }

    public static boolean upperTriangularMatrix(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 1; i < rows; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}