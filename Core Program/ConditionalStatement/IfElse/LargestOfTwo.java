package ConditionalStatement.IfElse;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a =  sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.err.println(a);
        } else {
            System.out.println(b);
        }
    }
}
