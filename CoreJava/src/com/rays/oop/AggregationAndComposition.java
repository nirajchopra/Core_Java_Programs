package com.rays.oop;

class Heart {
	private float weight;
	private int bpm;

	public Heart(float weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}

	public float getWeight() {
		return weight;
	}

	public int getBpm() {
		return bpm;
	}

}

class Bike {
	private String brand;
	private float mileage;

	public Bike(String brand, float mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}

	public String getBrand() {
		return brand;
	}

	public float getMileage() {
		return mileage;
	}

}

class Brain{
	private float weight;
	private String color;
	
	public Brain(float weight, String color) {
		this.weight=weight;
		this.color=color;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public String getColor() {
		return color;
	}
}

class Book1{
	private String name;
	private String author;
	
	public Book1(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
}

class Body{
	Heart heart = new Heart(250, 82);
	Brain brain = new Brain(1400, "Grey-Matter");
	
	public void hasA(Bike bike) {
		System.out.println(bike.getBrand());
		System.out.println(bike.getMileage());
	}
	
	public void hasA1(Book1 book) {
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
	}
}

public class AggregationAndComposition {
	public static void main(String[] args) {
		Body body=new Body();
		Bike bike = new Bike("Rider", 27.5f);
		Book1 book=new Book1("Java", "JamesGoshling");
		
		System.out.println(body.heart.getWeight());
		System.out.println(body.heart.getBpm());
		
		System.out.println(body.brain.getWeight());
		System.out.println(body.brain.getColor());
		
		body.hasA(bike);
		body.hasA1(book);
	}
}
