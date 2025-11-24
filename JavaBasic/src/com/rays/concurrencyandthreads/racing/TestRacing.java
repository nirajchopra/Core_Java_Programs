package com.rays.concurrencyandthreads.racing;

public class TestRacing {
	public static void main(String[] args) {

		// 2 threads banaye
		Racing r1 = new Racing("abc");
		Racing r2 = new Racing("xyz");

		// Dono start → dono same Account object ko access karenge
		// result unpredictable hoga (race condition)
		r1.start();
		r2.start();
	}
}
