package SubArrayAndTwoPointerAndSlidingWindow;

import java.util.HashSet;

public class SubarrayWithZeroSumExists {

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        System.out.println(zeroSumExists(arr));
    }

    public static boolean zeroSumExists(int[] arr) {
        int prefixSum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            }

            set.add(prefixSum);
        }

        return false;
    }
}