package com.rays.concurrencyandthreads.priority;

/*
 * What is Thread Priority?
 *
 * Java me har thread ko ek priority number diya ja sakta hai (1–10):
 * 1  = MIN_PRIORITY  (lowest priority)
 * 5  = NORM_PRIORITY (default)
 * 10 = MAX_PRIORITY  (highest priority)
 *
 * High priority ka matlab:
 * - Thread ko CPU time milne ka chance zyada hota hai.
 * - BUT yeh guarantee nahi hoti ki pehle wahi chalega.
 * JVM bas usko preference deti hai.
 */

public class PriorityThread extends Thread {

    String name = null;  // Thread ka naam store karega

    public PriorityThread(String name) {
        this.name = name; // Constructor se naam assign
    }

    @Override
    public void run() {
        // Thread ka actual kaam yeh hai — 1 se 10 tak print karna
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " = " + name);
        }
    }
}
