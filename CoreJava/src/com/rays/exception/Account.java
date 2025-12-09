package com.rays.exception;

public class Account {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Deposit method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: " + amount);
	}

	// Withdraw method
	public void withdraw(double amount) throws InsufficientBalance {
		if ((balance - amount) < 1000) {
			InsufficientBalance e = new InsufficientBalance("Amount is less than 1000... !!!!!");
			throw e;
		} else {
			balance = balance - amount;
		}
	}
}