package com.rays.oop.withconstractor;

public class Student{
	public static void main(String[] args) {
		Students s = new Students("Niraj Chopra", 123);
		System.out.println(s.name);
		System.out.println(s.roll);
	}
	
}

class Students {
	String name;
	int roll;
	
	Students(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
}