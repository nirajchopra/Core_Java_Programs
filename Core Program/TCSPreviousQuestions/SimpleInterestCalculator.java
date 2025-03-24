package TCSPreviousQuestions;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal =  3650;
        double time = 4;
        double simpleInterest = 584;

        double rate = (simpleInterest * 100)/(principal * time);

        System.out.println("Rate of interest : " + rate + "%");
    }
}
