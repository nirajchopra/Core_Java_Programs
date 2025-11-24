package Practice;

import java.util.Scanner;

public class Variable {
	// Swapping numbers
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = a;
		a = b;
		b = c;
		System.out.println("Swapping : a = " + a + ", b = " + b);
	}

}

//Convert Integer Number And Biinary Number
class ConvertIntegerNoAndBinaryNo {
	static void decToBinary(int n) {
		int[] binaryNum = new int[1000];
		int i = 0;
		while (n > 0) {
			// stored remainder in binary array
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNum[j]);
		}
	}

	public static void main(String[] args) {
		int n = 17;
		System.out.println("Decimal : " + n);
		System.out.print("Binary : ");
		decToBinary(n);
	}
}

//Factorial Number
class FactorialNumber {
	static int factorial(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++)
			res *= i;
		return res;
	}

	public static void main(String[] args) {
		int a = 5;
		System.out.println("Factorial of " + a + " is " + factorial(5));
	}
}

//Add Two Complex Number
class ComplexNumber {
	int real, image;

	public ComplexNumber(int r, int i) {
		this.real = r;
		this.image = i;
	}

	public void showC() {
		System.out.print(this.real + " +i" + this.image);
	}

	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res = new ComplexNumber(0, 0);
		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;
		return res;
	}

	public static void main(String arg[]) {

		ComplexNumber c1 = new ComplexNumber(4, 5);
		ComplexNumber c2 = new ComplexNumber(10, 5);
		System.out.print("first Complex number: ");
		c1.showC();

		System.out.print("\nSecond Complex number: ");
		c2.showC();

		ComplexNumber res = add(c1, c2);

		System.out.println("\nAddition is :");
		res.showC();
	}
}

//Calculate  SimpleInterest
class CalculateSimpleInterest {
	public static void main(String[] args) {
		float P = 10000, R = 5, T = 5;
		float SI = (P * T * R) / 100;
		System.out.println("Simple Interest : " + SI);
	}
}

//Increasing and Deacreasing Order 1 to n
class IncreasingDecreasingOrder1ToN {
	static void printDec(int n) {// Decreasing Order
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		System.out.print(n + " ");
		printDec(n - 1);
	}

	static void printInc(int n) {// Increasing Order
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		printInc(n - 1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// int n = 10;
		printInc(n);
		System.out.println();
		printDec(n);
	}
}

//First Occurance of an element in an array
class FirstOccuranceInArray {
	static int firstOccurance(int arr[], int key, int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == key) {
			return i;
		}
		return firstOccurance(arr, key, i + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 8, 3, 6, 5, 2, 7, 6, 9, 5, 0, 1 };
		System.out.println("First Index : " + firstOccurance(arr, 5, 0));
	}
}

//Last Occurrence of an element in an array
class LastOccuranceInArray {

	static int lastOccurance(int arr[], int key, int i) {
		if (i == arr.length) {
			return -1;
		}
		// result from the recursive call
		int restAns = lastOccurance(arr, key, i + 1);
		// if found in later part, return that index
		if (restAns != -1) {
			return restAns;
		}
		// if element matches at current index
		if (arr[i] == key) {
			return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 8, 3, 6, 5, 2, 7, 6, 9, 5, 0, 1 };
		System.out.println("Last Index : " + lastOccurance(arr, 5, 0));
	}
}

//print x^n
class PowerOfx {
	static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Power of x : " + power(2, 10));
	}
}

//Print x^n in 0(logn)
class PowerOfxInLogn {
	static int powerLogn(int a, int n) {
		int halfPower = powerLogn(a, n / 2);
		int halfPowerSq = halfPower + halfPower;
		// n is odd
		if (n % 2 != 0) {
			halfPowerSq = a * halfPowerSq;
		}
		return halfPowerSq;
	}

	public static void main(String[] args) {
		int a = 2;
		int n = 5;
		System.out.println(powerLogn(a, n));
	}
}

//Tiling Problem
class TilingProblem{
	
}
