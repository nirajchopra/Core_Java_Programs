package TCSPreviousQuestions;

import java.util.Scanner;

public class ExamFailurePercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Given data
        System.out.print("Pass in Physics : ");
        int physicsPass = sc.nextInt();  // % passed in Physics
        System.out.print("Pass in Maths : ");
        int mathPass = sc.nextInt();     // % passed in Mathematics
        System.out.print("Pass in Both : ");
        int bothPass = sc.nextInt();     // % passed in both subjects

        // Calculate percentage who passed in at least one subject
        int atLeastOnePass = physicsPass + mathPass - bothPass;

        // Calculate percentage who failed in both subjects
        int failedBoth = 100 - atLeastOnePass;

        // Print result
        System.out.println("Percentage of candidates who failed in both subjects: " + failedBoth + "%");
    }
}
