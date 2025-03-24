package TCSPreviousQuestions;

public class DivisibilityCheck {
    public static void main(String[] args) {
        int num = 19541742;

        // Check divisibility by 11
        boolean divisibleBy11 = isDivisibleBy11(num);

        // Check divisibility by 9
        boolean divisibleBy9 = isDivisibleBy9(num);

        // Check divisibility by 12 (3 and 4)
        boolean divisibleBy3 = isDivisibleBy3(num);
        boolean divisibleBy4 = isDivisibleBy4(num);
        boolean divisibleBy12 = divisibleBy3 && divisibleBy4;

        // Print results
        System.out.println("Divisibility results for number: " + num);
        System.out.println("Divisible by 11? " + divisibleBy11);
        System.out.println("Divisible by 9? " + divisibleBy9);
        System.out.println("Divisible by 12? " + divisibleBy12);
    }

    // Function to check divisibility by 11
    public static boolean isDivisibleBy11(int num) {
        String str = Integer.toString(num);
        int oddSum = 0, evenSum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (i % 2 == 0) oddSum += digit;
            else evenSum += digit;
        }
        return Math.abs(oddSum - evenSum) % 11 == 0;
    }

    // Function to check divisibility by 9
    public static boolean isDivisibleBy9(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 9 == 0;
    }

    // Function to check divisibility by 3
    public static boolean isDivisibleBy3(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 3 == 0;
    }

    // Function to check divisibility by 4
    public static boolean isDivisibleBy4(int num) {
        int lastTwoDigits = num % 100; // Get last two digits
        return lastTwoDigits % 4 == 0;
    }
}
