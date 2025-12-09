package com.rays.concurrencyandthreads.synchronization;

public class Account {

    private int balance = 0;  
    // Shared resource → dono threads isi balance ko update karenge

    public void setBalance(int balance) {
        try {
            Thread.sleep(200);   // Time delay → race condition ko simulate karne ke liye
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance; // Updated balance store kar raha hai
    }

    public int getBalance() {
        try {
            Thread.sleep(200);   // Delay to show inconsistent output when unsynchronized
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return balance;          // Current balance return
    }

    // 🔒 synchronized → ek time par sirf ek thread is method ko run kar sakta hai
    public synchronized void deposit(String name, int amt) {
        int total = getBalance() + amt;  // pehle current balance read
        setBalance(total);                // phir updated balance write
        System.out.println(name + " " + getBalance());
        /*
         * Without synchronized:
         * - Dono threads ek hi time par getBalance() aur setBalance() access karte
         *   toh galat output aata (race condition).
         *
         * With synchronized:
         * - Ek thread jab tak deposit() finish nahi karta, doosra wait karega.
         */
    }
}
