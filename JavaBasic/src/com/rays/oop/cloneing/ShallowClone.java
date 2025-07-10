package com.rays.oop.cloneing;

public class ShallowClone implements Cloneable{
	
	public int rollNo;
	
	@Override
	protected Object clone()  throws CloneNotSupportedException{
		return super.clone();
	}

}
