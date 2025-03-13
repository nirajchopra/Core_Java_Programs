package TypeConversion;
import java.util.*;

public class TypeConversionScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //In First Condition(error dega)
        // int number = sc.nextFloat();

        /*In second Condition
         * (is condition mai usne int ko float mai convert kar dega like : 2 hai to 2.0 kar dega )
         */
        float number = sc.nextInt();

        System.out.println(number);

    }
}
