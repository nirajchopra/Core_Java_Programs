package com.rays.oop.contructorcalling;

public class ContructorCalling {

	String fName;
	String lName;
	String Address;

	public ContructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName);
		System.out.println(lName);
	}

	public ContructorCalling(String fName, String lName, String Address) {
		this(fName, lName);
		System.out.println(Address);
		this.Address = Address;
	}
}
