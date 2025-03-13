package ConditionalStatement.SwitchStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 'a' value : ");
        int a = sc.nextInt();
       
        System.out.print("Enter 'b' value : ");
        int b = sc.nextInt();

        System.out.print("Enter Opertaor : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("Sum : " + (a+b));
                break;
                case '-': System.out.println("Subtract : " + (a-b));
                break;
                case '*': System.out.println("Product : " + (a*b));
                break;
                case '/': System.out.println("Divide : " + (a/b));
                break;
                case '%': System.out.println("Remainder : " + (a%b));
                break;
        
            default: System.out.println("Wrong Operator");
                break;
        }

       
    }
}
