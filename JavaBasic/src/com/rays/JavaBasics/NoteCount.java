package com.rays;

public class NoteCount {
	public static void main(String args[]) {
		int number = 7354;
		int count = 0;
		
		int[] note = {2000,1000,500,200,100,50,2,1};
		for(int i=0; i<=note.length; i++) {
			count = number/note[i];
			number = number%note[i];
			if(count>0) {
				System.out.println("Number: "+note[i] + "Count: "+count);
			}
		}
	}

}
