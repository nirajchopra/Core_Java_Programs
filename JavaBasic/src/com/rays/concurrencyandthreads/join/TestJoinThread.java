package com.rays.concurrencyandthreads.join;

public class TestJoinThread {

    public static void main(String[] args) {

        // Do threads create kiye
        JoinThread j1 = new JoinThread("abc");
        JoinThread j2 = new JoinThread("xyz");

        // Pehla thread start kiya
        j1.start();

        /*
         * MAIN THREAD yahan ruk jaayega!
         * 
         * j1.join() ka effect:
         * - Main thread wait karega jab tak j1 poora run() method complete na kar le.
         * - j2.start() tabhi chalega jab j1 ka 1–10 print ho chuka hoga.
         */
        try {
            j1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ab join() ke baad j2 start hoga
        j2.start();

        /*
         * Final Output Sequence (Always in this order):
         *
         * 1 = abc
         * 2 = abc
         * ...
         * 10 = abc
         *
         * (j1 finished → join completed)
         *
         * 1 = xyz
         * 2 = xyz
         * ...
         * 10 = xyz
         *
         * Reason: join() ne main thread ko forcibly wait karaya jab tak j1 finish nahi hua.
         */
    }
}
