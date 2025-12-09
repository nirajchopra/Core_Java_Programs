package com.rays.exercise;

import java.util.Random;

public class Exercise{
	// Two Maximum numbers.
	public void maximumNumber(int a,int b) {
	
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
		
	}
	// Two Minimum numbers.
	public void minimumNumber(int a,int b) {
		if (a < b) {
			System.out.println("a is smaller than b");
		} else {
			System.out.println("b is smaller than a");
		}
	}
	//factorial number.
	public int factoiralNumber(int a) {
		for(int i = 1; i <= a; ++i) {
			
			int factorial = i;
			System.out.println(factorial);
		}
		return a;
		
	}
	
	//Reverse Number.
	public int reverseNumber(int a, int b) {
		while(a!=0) {
			int r = a % 10;
			b = b * 10 + r;
			a = a/10;
		}
		System.out.println(b);
		return b;
	}
	
	//Fibonacci Series.
	public void fibonacciSeries(int a,int b) {
		int c;
		for (int i = 1; i <=10; i++) {
			c = a + b;
			
			System.out.println(a + " ");
			a = b;
			b = c;
		}
		
	}
	
	//2-Dimensional Array
	public static void twoDimensionalArray() {
		int row = 4;
		int col = 5;
		int[][] arr = new int[9][10];
		for(int i=0;i<row;i++) {
			
			for (int j=0;j<col;j++)  
				 {
					 arr[i][j] = (j+1)*(i+2);
				}
				
			
		}           
            System.out.println(" array is "); 
            for(int i=0; i<row;i++) {
            	for(int j=0; j<col;j++) {
            		System.out.print(arr[i][j]+" ");
            	}
            	System.out.println();
            	}
	}
	
	//Triangle pattern
	public static void trainglePattern() {
		int n =  5;
        for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}
	
	//ArmstrongNumber
	public void armstrongNumber(int num,int temp,int r) {
		int num2 = num;
		while (num2 != 0) {

			r = num2 % 10;
			temp = temp + r * r * r;
			num2 = num2 / 10;

		}

		if (temp == num) {

			System.out.println("ArmStrongNo");

		} else {
			System.out.println("Not ArmStrongNo");
		}

	}
	
	//Prime Number
	public void primeNumber(int num) {
		int count = 0;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				count++;
			}

		}
		if (count == 0) {

			System.out.println("prime");

		} else {

			System.out.println("not prime");
		}
	}
	
	//Palindrome number
	public int palindromeNumber(int num) {
		int temp = num ;
		int sum =0;
		while(num > 0) {
			int rem = num%10;
			 sum = (sum*10)+rem;
			num = num/10;
		}
		System.out.println(sum);
		if (sum==temp) {
			System .out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		return num;
	}
	
	//Harmonic series
	public static void harmonicSereis() {
		for (float i = 1; i <= 10; i++) {

			System.out.print(1 / i + ",");
		}
	}
	
	//consecutive Even and Odd
	public void consecutiveEvenAndOdd(int n) {
		int oddsum=0;
		int count1 = 0;
		int count2=0;
		int evensum=0;
		for (int i=1; i<=n;i++) {
			if(i%2==0) {
				count1++;
				oddsum = oddsum+i;
			} else {
				count2++;
				evensum = evensum+i;
			}
			
		}
		System.out.println("the average of consecutive odd no is "+(oddsum/count1));
		System.out.println("the average of consecutive even no is "+(evensum/count2));

	}
	
	//SecondLargestNumber
	public static void secondLargestNumber() {
		int[] num = { 1,2,3,4,5};
		int max = 0;
		int min = 0;

		for (int i = 0; i < num.length; i++) {

			if (max < num[i]) {
				min = max;
				max = num[i];
			}

			if (min < num[i] && max > num[i]) {

				min = num[i];

			}

		}
		System.out.println("secound largest : "+min);

	}
	
	//Missing number
	public void missingNumber() {
		int a [] = {20,10,50,60};
		int b [] = {20,10,50,60,70};
		
		int suma = 0;
		int sumb = 0;
		
		for (int i = 0; i < a.length; i++) {
			suma = suma + a[i];
		}
		for (int j = 0; j < b.length; j++) {
			sumb = sumb + b[j];
		}
		System.out.println(sumb - suma);
	}
	
	//Descending order
	public void descendingOrder() {
		int arr[] = {10, 50, 80, 40, 5};
		int num =80;
		
		int temp = -1;
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				temp = i;
				break;
			}
			
		}
		System.out.println(temp);
	}
	
	//Random number
	public void randomNumber() {
		Random r = new Random();

		for (int i = 0; i < 5; i++) {

			int random = r.nextInt(50);

			System.out.println(random);

		}
	}
}