package com.rays.concurrencyandthreads.ThreadAndNotThreadRunnable;

public class TestWithThread {

    public static void main(String[] args) {

        // Two threads created directly (because class extends Thread)
        WithThread t1 = new WithThread("abc");
        WithThread t2 = new WithThread("xyz");

        t1.start(); 
        // start() → new thread create karta hai
        // and run() method alag Thread me execute karta hai

        t2.start();
        // Second thread start → parallel execution

        /*
         * Output (order unpredictable):
         * 1 = abc
         * 1 = xyz
         * 2 = abc
         * 2 = xyz
         * ...
         *
         * Because both threads run concurrently.
         */
    }
}
