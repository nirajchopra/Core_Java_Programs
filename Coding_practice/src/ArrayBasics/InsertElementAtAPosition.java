package ArrayBasics;

import java.util.Arrays;

public class InsertElementAtAPosition {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int pos = 2;
        int val = 3;

        int[] arr = new int[a.length + 1];

        for (int i = 0; i < pos; i++) {
            arr[i] = a[i];
        }

        arr[pos] = val;

        for (int i = pos; i < a.length; i++) {
            arr[i + 1] = a[i];
        }

        System.out.println("InsertElementAtAPosition : " + Arrays.toString(arr));
    }
}