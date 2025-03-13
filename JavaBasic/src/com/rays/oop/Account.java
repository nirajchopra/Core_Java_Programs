package com.rays.oop;

public class Account {
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    private double balance; // Changed to double

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) { // Changed parameter type to double
        this.balance = balance;
    }
}
