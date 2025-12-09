package com.rays.oop.Shallow;

public class Account implements Cloneable {

	public int balance;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}