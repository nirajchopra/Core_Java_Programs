package com.rays;

public class MultiDimensionalArray {
	public static void main(String args[]) {
		//10 rows and 2 columns
		int [][] table = new int[7][2];
		//Add values in column 1.
		table[0][0]=2;
		table[1][0]=4;
		table[2][0]=6;
		table[3][0]=8;
		table[4][0]=10;
		table[5][0]=12;
		table[6][0]=14;
		
		//Add values in column 2.
		table[0][1]=3;
		table[1][1]=6;
		table[2][1]=9;
		table[3][1]=12;
		table[4][1]=15;
		table[5][1]=18;
		table[6][1]=21;
		
		//Print all the elements of 2D array.
		for(int row=0; row<table.length; row++) {
			for(int col=0; col<table[0].length; col++) {
				System.out.print(table[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
