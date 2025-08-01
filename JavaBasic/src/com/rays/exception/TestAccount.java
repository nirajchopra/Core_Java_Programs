package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) {

		Account a = new Account();
		a.setBalance(2000);
		System.out.println("Total Balance  : " + a.getBalance() );
		
		a.deposit(100);
		System.out.println("After Balance : " + a.getBalance());
		
		try {
			a.withdraw(200);
			System.out.println("Withdrawl : " + a.getBalance());
		} catch (InsufficientBalance e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}