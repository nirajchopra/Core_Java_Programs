package Functions;

import java.util.Scanner;

public class HelloWorld {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

    

    public static void calculateSum(int a, int b) {
        int c = a + b;
        System.out.println("Sum is : " + c);
    }

    public static void main(String[] args) {
        printHelloWorld();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        calculateSum(a, b);
    }
}
