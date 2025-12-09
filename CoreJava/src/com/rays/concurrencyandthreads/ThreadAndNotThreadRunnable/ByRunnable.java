package com.rays.concurrencyandthreads.ThreadAndNotThreadRunnable;

public class ByRunnable implements Runnable {

    String name = null; 
    // Thread ka naam store karega (abc / xyz)

    public ByRunnable(String name) {
        this.name = name; // Constructor se naam set ho raha hai
    }

    @Override
    public void run() {
        // Yeh code Thread ke start() par execute hoga
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " = " + name);
        }
        /*
         * Runnable me run() method ka use hota hai.
         * Yahan koi Thread class extend nahi kiya — sirf interface implement kiya hai.
         */
    }
}
