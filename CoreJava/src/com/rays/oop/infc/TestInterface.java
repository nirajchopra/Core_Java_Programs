package com.rays.oop.infc;

interface Calculator{
	void add();
	void sub();
}

class Calculator1 implements Calculator{
	@Override
	public void add() {
		System.out.println(10+20);
	}
	
	@Override
	public void sub() {
		System.out.println(20-10);
	}
}

class Calculator2 implements Calculator{
	@Override
	public void add() {
		System.out.println(70+60);
		
	}
	
	@Override
	public void sub() {
		System.out.println(70-50);
	}
}

public class TestInterface {
	public static void main(String[] args) {
		
		
		Calculator c=new Calculator1(); 
		Calculator d=new Calculator2();
		
		c.add();
		c.sub();
		
		d.add();
		d.sub();
	}
}


