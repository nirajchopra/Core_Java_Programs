package com.rays.concurrencyandthreads.synchronization;

public class TestRacing {

    public static void main(String args[]) {

        Racing r1 = new Racing("abc");   // Thread 1
        Racing r2 = new Racing("xyz");   // Thread 2

        r1.start();   // Thread 1 start
        r2.start();   // Thread 2 start

        /*
         * Because deposit() is synchronized:
         * - abc thread pehle deposit kar sakta hai 
         *   ya xyz pehle kar sakta hai (scheduler ke hisaab se)
         * - Lekin ek time par sirf ek hi thread deposit() execute karega.
         *
         * Output (order may vary but consistent):
         * abc 1000
         * abc 2000
         * ...
         * xyz 6000
         * xyz 7000
         * ...
         *
         * Yani balance kabhi bhi corrupt nahi hoga.
         */
    }
}
