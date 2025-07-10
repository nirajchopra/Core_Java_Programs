package com.rays.oop.cloneing;

public class TestShallowClone {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		ShallowClone s = new ShallowClone();
		s.rollNo = 100;
		ShallowClone s1 = (ShallowClone)s.clone();
		s.rollNo = 101;
		System.out.println(s.rollNo);
		System.out.println(s1.rollNo);
		
	}

}
