package com.rays.collection.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestEvenOdd {

	public static void main(String[] args) {

		//   Step 1: Array banaya of integers
		int[] arr = {2, 4, 5, 7, 9, 6};

		//   Step 2: IntStream banaya using Arrays.stream (primitive int[] ke liye)
		IntStream stream = Arrays.stream(arr);

		//   Step 3: Stream pipeline start

		stream

			//   Filter kara sirf even numbers (jo 2 se divide ho jaaye)
			.filter(e -> e % 2 == 0)

			//   Duplicate hata diye (agar ho)
			.distinct()

			//   Numbers ko ascending order me sort kiya
			.sorted()

			//   Har number ko print kar diya
			.forEach(e -> {
				System.out.println(e);
			});
	}
}
