package Matrix_2D;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setMatrixZeroes(arr);
    }

    public static void setMatrixZeroes(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Check first row
        for (int j = 0; j < cols; j++) {
            if (arr[0][j] == 0) {
                firstRow = true;
            }
        }

        // Check first column
        for (int i = 0; i < rows; i++) {
            if (arr[i][0] == 0) {
                firstCol = true;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Set marked rows and columns to zero
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // Set first row to zero
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                arr[0][j] = 0;
            }
        }

        // Set first column to zero
        if (firstCol) {
            for (int i = 0; i < rows; i++) {
                arr[i][0] = 0;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}