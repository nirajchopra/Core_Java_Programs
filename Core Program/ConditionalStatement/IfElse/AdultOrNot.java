package ConditionalStatement.IfElse;

import java.util.Scanner;

public class AdultOrNot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult : drive, vote");
        } else {
            System.out.println("Not Adult");
        }
    }
}
