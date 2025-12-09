package com.rays.oop;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        
        // Set account details
        account.setAccountNumber("8305443480");
        account.setAccountType("Savings");
        account.setBalance(1000.54); // Set balance
        
        // Get and print account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance());
    }
}
