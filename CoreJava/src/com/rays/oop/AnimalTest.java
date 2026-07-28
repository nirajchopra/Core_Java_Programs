package com.rays.oop;

class Animal {
	void breadth() {
		System.out.println("All animal are breadth");
	}
	
	void eats() {
		System.out.println("Eats meat and grass");
	}
	
	void sleeps() {
		System.out.println("All animal are sleeps");
	}
}

class Deer extends Animal{
	
	@Override
	void eats() {
		System.out.println("Deer eats grass only");
	}
	
	void runFast() {
		System.out.println("Deers runs faster than other Animals");
	}
}

class Tiger extends Animal{
	
	@Override
	void eats() {
		System.out.println("Tiger eats meat");
	}
	
	void nationalAnimal() {
		System.out.println("Tiger is a National Animal");
	}
}

class Monkey extends Animal{
	
	@Override
	void eats() {
		System.out.println("Monkey eats food");
	}
	
	void jump() {
		System.out.println("Monkey jumps so high");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		
		Deer d = new Deer();
		Tiger t = new Tiger();
		Monkey m = new Monkey();
		
		d.breadth();
		d.eats();
		d.sleeps();
		d.runFast();
		
		System.out.println("-----------------------------------");
		
		t.breadth();
		t.eats();
		t.sleeps();
		t.nationalAnimal();
		
		System.out.println("-----------------------------------");
		
		m.breadth();
		m.eats();
		m.sleeps();
		m.jump();
	}
}
