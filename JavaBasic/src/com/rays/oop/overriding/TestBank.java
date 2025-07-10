package com.rays.oop.overriding;

public class TestBank {
    public static void main(String[] args) {
        Bank axisBank = new AXISBank();
        Bank hdfcBank = new HDFCBank();
        Bank iciciBank = new ICICIBank();
        
        System.out.println("Name of AXIS Bank: " + axisBank.getName());
        System.out.println("Interest rate of AXIS Bank: " + axisBank.interestRate());
        
        System.out.println("Name of HDFC Bank: " + hdfcBank.getName());
        System.out.println("Interest rate of HDFC Bank: " + hdfcBank.interestRate());
        
        System.out.println("Name of ICICI Bank: " + iciciBank.getName());
        System.out.println("Interest rate of ICICI Bank: " + iciciBank.interestRate());
    }
}
