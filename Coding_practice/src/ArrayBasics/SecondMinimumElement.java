package ArrayBasics;

public class SecondMinimumElement {

    public static void main(String[] args) {

//        int[] arr = {3, 9, 2, 7, 10};
        int[] arr = {3,3};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } 
            else if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Second minimum element does not exist.");
        } else {
            System.out.println("Second Minimum: " + secondMin);
        }
    }
}