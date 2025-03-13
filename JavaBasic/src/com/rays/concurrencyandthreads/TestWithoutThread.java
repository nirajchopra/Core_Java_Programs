package com.rays.concurrencyandthreads;

public class TestWithoutThread {
	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("abc");
		WithoutThread t2 = new WithoutThread("xyz");
		
		t1.run();
		t2.run();
	}

}
