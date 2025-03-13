package ConditionalStatement.TernaryOperator;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String str = (((num % 2) == 0)?"EVEN":"ODD");

        System.out.println(str);
    }
}
