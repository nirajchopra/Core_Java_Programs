package com.rays.concurrencyandthreads.racing;

public class Racing extends Thread {
	String name = null;

	// Ek hi shared Account object sab threads use kar rahe hai
	public static Account account = new Account();

	public Racing(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// Har thread 5 baar deposit karega
		for (int i = 1; i <= 5; i++) {
			account.deposit(name, 1000);
			// 1000 rupaye deposit, but synchronization nahi hai → race condition
		}
	}
}
