package ArrayBasics;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12};
        System.out.print("Move Zero To End : ");
        moveZeroToEnd(arr);
    }

    static void moveZeroToEnd(int[] arr) {

        int n = arr.length;
        int index = 0;

        // Move all non-zero elements to the beginning
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}