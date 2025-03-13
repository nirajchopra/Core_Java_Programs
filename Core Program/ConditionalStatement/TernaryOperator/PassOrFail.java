package ConditionalStatement.TernaryOperator;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float marks = sc.nextFloat();

        String number = (((marks >= 33)?"PASS":"FAIL"));

        System.out.println(number);
    }
}
