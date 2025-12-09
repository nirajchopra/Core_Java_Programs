package com.rays.concurrencyandthreads.priority;

public class TestPriorityThread {

    public static void main(String[] args) {

        // Do thread objects bana rahe hain
        PriorityThread p1 = new PriorityThread("abc");
        PriorityThread p2 = new PriorityThread("xyz");

        // Thread priorities set kar rahe hain
        p1.setPriority(10); // MAX_PRIORITY → High preference
        p2.setPriority(1);  // MIN_PRIORITY → Low preference

        /*
         * JVM ko yeh priority batata hai ki kaunsa thread zyada important hai.
         * But order guarantee nahi.
         * Ho sakta hai p1 pehle chale, ya p2 — depend karta hai scheduler par.
         */

        p1.start();  // High priority thread start
        p2.start();  // Low priority thread start
    }
}
