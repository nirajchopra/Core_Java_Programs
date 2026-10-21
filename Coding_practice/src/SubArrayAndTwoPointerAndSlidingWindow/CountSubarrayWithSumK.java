package SubArrayAndTwoPointerAndSlidingWindow;

public class CountSubarrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;

        int count = 0;
        int left = 0;
        int windowSum = 0;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            while (windowSum > k) {
                windowSum -= arr[left];
                left++;
            }

            if (windowSum == k) {
                count++;
            }
        }

        System.out.println("CountSubarrayWithSumK : " + count);
    }
}