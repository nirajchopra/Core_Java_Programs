package Functions;

public class Swap {
    public static void swapNumber(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
       
        //swap -- values exchanges
       
        int a = 5;
        int b = 10;
        swapNumber(a, b);
    }
}
