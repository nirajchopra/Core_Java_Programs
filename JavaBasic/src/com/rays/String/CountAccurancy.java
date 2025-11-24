package com.rays;

public class CountAccurancy {
	public static void main(String[] args) {
		String name = "nikunj patwariya";
		int count = 0;
		for(char a='a'; a<='z'; a++) {
			for(int i=0; i<name.length(); i++) {
				if(a==name.charAt(i)) {
					count++;
				}
			}
			if(count!=0) {
				System.out.println(a+""+ count + " ");
				count = 0;
			}
		}
	}

}