package com.rays.concurrencyandthreads.synchronization;

public class Racing extends Thread {

    String name = null;               // Thread ka naam (abc / xyz)

    public static Account account = new Account();
    // Static → Do threads same Account object use karenge

    public Racing(String name) {
        this.name = name;             // Thread ka naam set
    }

    @Override
    public void run() {
        // Ek thread 5 baar deposit karega
        for (int i = 1; i <= 5; i++) {
            account.deposit(name, 1000);  
            // deposit synchronized hai → thread-safe
        }
    }
}
