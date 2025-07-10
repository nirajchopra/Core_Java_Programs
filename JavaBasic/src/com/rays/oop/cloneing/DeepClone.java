package com.rays.oop.cloneing;

import com.rays.oop.deep.Account;

public class DeepClone implements Cloneable{
	
	public String name;
	public Account no;
	
	public DeepClone(String name) {
		this.name = name;
		no = new Account(100);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		DeepClone d = (DeepClone)super.clone();
		return d;
	}

}
