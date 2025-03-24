package TCSPreviousQuestions;

public class DivisibilityCheck2 {
    public static void main(String[] args) {
        int num1 = 27840;
        int num2 = 7329753;

        // Check divisibility by 12 (both 3 and 4)
        boolean isDivisibleBy12 = (num1 % 3 == 0) && (num1 % 4 == 0);

        // Check divisibility by 9
        boolean isDivisibleBy9 = sumOfDigits(num2) % 9 == 0;

        System.out.println("27840 is divisible by 12: " + isDivisibleBy12);
        System.out.println("7329753 is divisible by 9: " + isDivisibleBy9);

        if (isDivisibleBy12 && isDivisibleBy9) {
            System.out.println("Both statements are true.");
        } else if (isDivisibleBy12) {
            System.out.println("Statement I is true, but II is not.");
        } else if (isDivisibleBy9) {
            System.out.println("Statement I is not true, but II is true.");
        } else {
            System.out.println("Both statements are not true.");
        }
    }

    // Helper function to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

