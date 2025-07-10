package com.rays.oop.cloneing;

public class TestDeepClone {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		DeepClone d = new DeepClone("Niraj");
		DeepClone d1 =  (DeepClone)d.clone();
		d1.name = "Priyanshu";
		d1.no.balance = 200;
		
		System.out.println(d1.name);
		System.out.println(d1.no.balance);
	}

}
