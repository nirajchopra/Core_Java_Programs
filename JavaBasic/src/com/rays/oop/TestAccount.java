package com.rays.oop;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        
        // Set account details
        account.setAccountNumber("1234567890");
        account.setAccountType("Savings");
        account.setBalance(1000.0); // Set balance
        
        // Get and print account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance()); // Print balance
    }
}
