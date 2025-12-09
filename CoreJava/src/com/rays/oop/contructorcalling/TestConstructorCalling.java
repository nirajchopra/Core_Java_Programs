package com.rays.oop.contructorcalling;

public class TestConstructorCalling extends ContructorCalling {

	public TestConstructorCalling(String fName, String lName, String Address) {
		super(fName, lName, Address);
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("Niraj", "Chopra", "Indore");

	}
}
