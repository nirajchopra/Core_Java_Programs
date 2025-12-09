package com.rays.Arrays;

public class Arrays1 {
	
	public static void update(int marks[]) {
		for(int i = 0; i<marks.length; i++) {
			marks[1] = marks[i]+1;
		}
	}
	
	public static void main(String[] args) {
		//dataType arrayName[] = new dataType[size];
		int marks[]= {97,98,99};
		update(marks);
		
		//print our marks
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]+" ");
			
		}
		System.out.println();
		
	}

}
