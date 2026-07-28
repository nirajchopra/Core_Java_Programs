package com.rays.oop;

class Test{
	//Static variables
	static int a,b;
	
	//Static block
	static {
		System.out.println("Inside the static block");
		a=10;
		b=20;
	}
	
	//Static method
	static void fun1(){
		System.out.println("Inside the static method");
	}
	
	//Instance block
	int x,y;
	{
		System.out.println("Inside the instance block");
	}
	
	//Instance method
	void fun2() {
		System.out.println("Inside the instance method");
	}
	
	//Constructor
	public Test() {
		System.out.println("Inside the constructor");
	}
}

public class DemoStatic {
	public static void main(String[] args) {
		
		Test.fun1(); // Static
		Test t=new Test();
		t.fun2(); // Instance
	}

}
