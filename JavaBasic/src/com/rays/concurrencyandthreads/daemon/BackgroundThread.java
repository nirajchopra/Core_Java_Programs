package com.rays.concurrencyandthreads.daemon;

/*
 * Is program me do threads chal rahe hain:
 * 1. Main Thread  – jo numbers print karta hai (1 to 100)
 * 2. Daemon Thread – background me continuously “daemon thread” print karta hai
 *
 * Daemon thread tab tak hi chalta hai jab tak main thread alive hai.
 * Jaise hi main thread finish hota hai → daemon thread automatically band ho jata hai.
 *
 * Key Concept: Daemon Thread
 * - Daemon = background helper thread
 * - Yeh low-priority background task hota hai
 * - JVM daemon threads ko automatically close kar deti hai jab sare normal threads khatam ho jaate hain
 */

public class BackgroundThread extends Thread {

    String name = null;  // Thread ka naam store karega

    public BackgroundThread(String name) {
        this.name = name; // Naam constructor se set ho raha hai
    }

    @Override
    public void run() {
        // Infinite loop: yeh thread continuously background me chalega
        while (true) {
            try {
                Thread.sleep(200); // Har print se pehle 200 ms rukega
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Daemon thread apna naam print karega
            System.out.println(name);
        }
    }
}
