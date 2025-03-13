package com.rays.oop;

public class PenStudentBankAccount {
	
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.setColor("Red");
		p1.setTip(5);
		System.out.println(p1.getColor());
		System.out.println(p1.getTip());
		
		Student s1 = new Student();
		s1.setAge(21);
		s1.setName("Niraj Chopra");
		s1.setPercentage(30.2f);
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getPercentage());
		
		BankAccount bank = new BankAccount();
		bank.username = "Niraj Chopra";
		bank.setPassword(123456);
		System.out.println(bank.getUsername());
		System.out.println(bank.getPassword());
		
		
	}
	

}

class Pen{
	private String color;
	private int tip;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTip() {
		return tip;
	}
	public void setTip(int tip) {
		this.tip = tip;
	}
	
	
	}


class Student{
	private String name;
	private int age;
	private float percentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		int math = 20;
		int chem = 30;
		int phy = 12;
		percentage = (phy + chem + math)/3;
		
		this.percentage = percentage;
	}
	
	
}

class BankAccount {
	public String username;
	private int password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
