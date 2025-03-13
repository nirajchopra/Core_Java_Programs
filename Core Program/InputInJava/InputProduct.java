package InputInJava;
import java.util.*;

public class InputProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int Product = a * b;

        System.out.println("Product of a & b = " + Product);
    }
}
