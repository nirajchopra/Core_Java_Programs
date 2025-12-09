package com.rays.concurrencyandthreads.ThreadAndNotThreadRunnable;

public class WithThread extends Thread {

    String name = null; 
    // Thread ka naam store karega (abc / xyz)

    public WithThread(String name) {
        this.name = name; 
        // Constructor → thread ka naam assign
    }

    @Override
    public void run() {
        // Thread start hone ke baad yeh method execute hota hai
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " = " + name);
        }
        /*
         * Thread class ko extend karne ka matlab:
         * - Yeh class khud ek Thread hai
         * - Direct start() call kar sakte
         */
    }
}
