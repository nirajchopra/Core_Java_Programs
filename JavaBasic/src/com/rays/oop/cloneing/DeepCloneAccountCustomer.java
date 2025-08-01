package com.rays.oop.cloneing;

public class DeepCloneAccountCustomer {
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Account a = new Account(100);
		Customer c1 = new Customer("abc", a);
		Customer c2 = (Customer)c1.clone();
		c2.name = "xyz";
		c2.account.balance = 200;
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
		
	}

}
