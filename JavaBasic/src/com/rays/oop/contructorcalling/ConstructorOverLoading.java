package com.rays.oop.contructorcalling;

public class ConstructorOverLoading {

	private int num;
	private String name;
	private String add;

	public ConstructorOverLoading() {
		System.out.println("default constructor");
	}

	public ConstructorOverLoading(int num) {
		this.num = num;
		System.out.println(num);
	}

	public ConstructorOverLoading(int num, String name) {
		this.num = num;
		this.name = name;
		System.out.println(num);
		System.out.println(name);
	}

	public ConstructorOverLoading(String name, String add) {

		this.add = add;
		this.name = name;
		System.out.println(name);
		System.out.println(add);

	}

	public static void main(String[] args) {

		ConstructorOverLoading c = new ConstructorOverLoading();

		ConstructorOverLoading c1 = new ConstructorOverLoading(1);

		ConstructorOverLoading c2 = new ConstructorOverLoading(2, "NC");

		ConstructorOverLoading c3 = new ConstructorOverLoading("NC", "kota");

	}

}
