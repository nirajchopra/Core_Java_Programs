package com.rays.concurrencyandthreads.racing;

public class Account {

	private int balance = 0; // Account ka balance (shared resource)

	public void setBalance(int balance) {
		try {
			Thread.sleep(200); // 200ms delay → race condition ko aur clear dikhane ke liye
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance; // New balance set kiya ja raha hai
	}

	public int getBalnce() {
		try {
			Thread.sleep(200); // 200ms delay while reading the balance
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance; // Current balance return
	}

	public void deposit(String name, int amt) {
		// Pura deposit process atomic nahi hai (problem yahi se shuru hoti hai)
		int total = getBalnce() + amt; // 1) Current balance read karo
										// Agar doosra thread beech me update karega to problem hogi
		setBalance(total); // 2) New balance write karo
							// Yeh bhi delay ki wajah se overwrite ho sakta hai

		System.out.println(name + " " + getBalnce());
		// Deposit ke baad updated balance print
	}
}
