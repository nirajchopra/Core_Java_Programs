package Loops.ForLoop;

import java.util.Scanner;

public class TableOfAnyNumber {
    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(5);
    }
}
