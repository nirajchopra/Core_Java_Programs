package TCSPreviousQuestions;

public class SimplifyExpression {
    public static void main(String[] args) {
        // Compute numerator
        double numerator = Math.pow(0.7, 3) + Math.pow(0.3, 3) + (0.3 * 0.7 * 3);

        // Compute denominator
        double denominator = Math.pow(0.7, 2) + Math.pow(0.3, 2) + 0.42;

        // Compute result
        double result = numerator / denominator;

        // Print result
        System.out.println("Result: " + result);
    }
}
