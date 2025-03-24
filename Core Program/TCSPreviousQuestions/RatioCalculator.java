package TCSPreviousQuestions;

public class RatioCalculator {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 6, d = 12;

        double numerator = a + b + c + d;
        double denominator = b + d;
        
        double result = Math.sqrt(numerator/denominator);

        System.out.println("value : " + (int)(result * 4) + " : " + (int)(result * 4 / 1.25));
    }
}
