package com.rays.oop;

public class Bank {
	
	//Polymorphism Method
    String getName() {
        return "Banks";
    }
    
    double interestRate() {
        return 11.0;
    }
}

class AXISBank extends Bank {
    @Override
    String getName() {
        return "AXIS Bank";
    }
    
    @Override
    double interestRate() {
        return 10.0; // Interest rate for AXIS Bank
    }
}

class HDFCBank extends Bank {
    @Override
    String getName() {
        return "HDFC Bank";
    }
    
    @Override
    double interestRate() {
        return 9.5; // Interest rate for HDFC Bank
    }
}

class ICICIBank extends Bank {
    @Override
    String getName() {
        return "ICICI Bank";
    }
    
    @Override
    double interestRate() {
        return 8.75; // Interest rate for ICICI Bank
    }
}

