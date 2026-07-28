package com.rays.oop;

import java.util.Scanner;

class Busniness{
	private float si;
	private float p;
	static private float r;
	//static private float r=15.2f;
	private float t;
	
	static {
		r=15.2f;
	}

	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal Amount");
		p=scan.nextFloat();
		System.out.println("Enter the Time");
		t=scan.nextFloat();
		//r=15.2f; //this take more bytes or space
	}
	
	void calcInterest() {
		si=(p*r*t)/100;
	}
	
	void printSI() {
		System.out.println(si);
	}
}

public class DemoBusiness {
	public static void main(String[] args) {
		
		Busniness b1=new Busniness();
		b1.input();
		b1.calcInterest();
		b1.printSI();
		
		Busniness b2=new Busniness();
		b2.input();
		b2.calcInterest();
		b2.printSI();
		
		Busniness b3=new Busniness();
		b3.input();
		b3.calcInterest();
		b3.printSI();
	}
}
