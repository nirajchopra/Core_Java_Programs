package com.rays.concurrencyandthreads.daemon;

public class TestDaemonThread {

    public static void main(String[] args) {

        // BackgroundThread ka object banaya
        BackgroundThread t1 = new BackgroundThread("daemon thread");

        // Thread ko daemon declare kiya
        // Matlab: yeh background helper thread hai
        // JVM isko automatically stop kar degi jab main thread end hoga
        t1.setDaemon(true);

        // Daemon thread start
        t1.start();

        // Main thread 1 se 100 tak print karega
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100); // Har number ke beech 100 ms ka delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Main thread ka output
            System.out.println(i + "main");
        }

        /*
         * Expected Output Pattern:
         *
         * daemon thread
         * 1main
         * daemon thread
         * 2main
         * daemon thread
         * 3main
         * ...
         * ...
         * 100main
         *
         * Jaise hi main thread 100 print kar lega → JVM daemon thread ko automatically band kar degi
         */
    }
}
