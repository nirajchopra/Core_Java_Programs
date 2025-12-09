package com.rays.concurrencyandthreads.join;

/*
 * join() ka simple matlab:
 * 
 * "Is thread ka poora kaam khatam hone ka wait karo, phir aage code chalao."
 * 
 * Example:
 * Agar main thread ne j1.join() call kiya → main thread ruk jaayega
 * jab tak j1 ka run() method 100% complete nahi ho jaata.
 */

public class JoinThread extends Thread {

    String name = null; // Thread ka naam store karega

    public JoinThread(String name) {
        this.name = name; // Constructor se naam set ho raha hai
    }

    @Override
    public void run() {
        // Yeh loop thread ka actual kaam kar raha hai
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " = " + name);
        }
    }
}
