package com.rays;
import java.util.*;
public class ParallelSort {
	public static void main(String args[]) {
		int[] a = {12,6,76,5,20,8};
		
		Arrays.parallelSort(a);
		for(int i: a) {
			System.out.println(i);
		}
		
		
	}

}
