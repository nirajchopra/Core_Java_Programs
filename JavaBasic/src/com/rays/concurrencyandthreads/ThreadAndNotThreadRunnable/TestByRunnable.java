package com.rays.concurrencyandthreads.ThreadAndNotThreadRunnable;

public class TestByRunnable {

    public static void main(String[] args) {

        // Runnable object banaya (NOT a thread)
        ByRunnable r1 = new ByRunnable("abc");
        ByRunnable r2 = new ByRunnable("xyz");

        // Runnable ko Thread ke constructor me pass kiya
        Thread t1 = new Thread(r1); 
        Thread t2 = new Thread(r2);

        // Ab Thread class ka start() method call hoga
        t1.start(); 
        t2.start();

        /*
         * NOTE:
         * Runnable object khud thread nahi hota,
         * isse thread banane ke liye Thread class ki need hoti hai.
         * 
         * Output (order unpredictable because threads run parallel):
         * 1 = abc
         * 1 = xyz
         * 2 = abc
         * 2 = xyz
         * ...
         */
    }
}
