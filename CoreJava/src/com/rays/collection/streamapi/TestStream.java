package com.rays.collection.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		//  Step 1: List of Strings banayi (with duplicate "three")
		List<String> list = Arrays.asList("one", "two", "three", "four", "three", "twenty");

		//  Step 2: Stream banaya list ke elements pe
		Stream<String> stream = list.stream();

		//  Step 3: Stream pipeline — operations one by one
		stream

			//  map(): Har element ko uppercase me convert karta hai
			.map(e -> e.toUpperCase())

			//  filter(): Sirf un elements ko allow karta hai jo "T" se start hote hain
			.filter(e -> e.startsWith("T"))

			//  sorted(): Alphabetical order me sort karta hai
			.sorted()

			//  distinct(): Duplicate entries hata deta hai
			.distinct()

			//  forEach(): Final result print karta hai
			.forEach(e -> {
				System.out.println(e);
			});
	}
}
