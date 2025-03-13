package com.rays.oop.inheritance;

public class Inheritance {
	public static void main(String[] args) {
		Fish shark = new  Fish();
		
		shark.fins = 2;
		System.out.println(shark.fins);

		Dog dobby = new Dog();
		dobby.eat();
		dobby.legs = 4;
		System.out.println(dobby.legs);
		
		
	}

}

class Animal {
	String color;
	void eat() {
		System.out.println("Eats");
	}
	
	void breathe() {
		System.out.println("Breathes");
	}
	
}

class Mamal extends Animal {
	int legs;
}

class Dog extends Mamal{
	String breed;
}

//Derived Class/ subclass
class Fish extends Animal {
	int fins;
	
	void swim() {
		System.out.println("Swims in water");
	}
}
