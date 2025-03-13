package com.rays.collection.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.rays.Array;

public class TestEvenOdd {
	public static void main(String[] args) {
		
		int[] arr = {2,4,5,7,9,6};
		
		IntStream stream = Arrays.stream(arr);
		
		stream.filter(e -> e % 2 ==0).distinct().sorted().forEach(e -> {System.out.println(e);});
		
	}

}
