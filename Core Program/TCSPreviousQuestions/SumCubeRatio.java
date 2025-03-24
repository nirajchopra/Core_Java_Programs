package TCSPreviousQuestions;

public class SumCubeRatio {
    public static void main(String[] args) {
        
        int sumOfSquares = 138;
        int sumOfProducts = 131;
        int product = 280;

        //Calculate (a + b + c)^2
        int sumSquare = sumOfSquares + 2 *  sumOfProducts;

        int sum = (int) Math.sqrt(sumSquare);

        //Calculate a^3 + b^3 + c^3
        int sumCube = (sum * (sumOfSquares - sumOfProducts)) + (3 * product);

        //Calculate ratio
        int gcd = gcd(sumSquare, sumCube);

        System.out.println("Ratio : " + (sumSquare/gcd) + " : " + (sumCube / gcd));

    }

    //Function to calculate GCD
    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
