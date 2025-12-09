package com.rays.exercise;

public class TestExercise {
	public static void main(String[] args) {
		Exercise ex = new Exercise();
		ex.maximumNumber(5, 8);
		ex.minimumNumber(6, 7);
		ex.factoiralNumber(10);
		ex.fibonacciSeries(0, 1);
		ex.reverseNumber(243, 0);
		Exercise.twoDimensionalArray();
		ex.armstrongNumber(371, 0, 0);
		Exercise.trainglePattern();
		ex.primeNumber(16);
		ex.palindromeNumber(12321);
	    Exercise.harmonicSereis();
		ex.consecutiveEvenAndOdd(5);
		Exercise.secondLargestNumber();
		ex.missingNumber();
		ex.descendingOrder();
		ex.randomNumber();
	}
}
