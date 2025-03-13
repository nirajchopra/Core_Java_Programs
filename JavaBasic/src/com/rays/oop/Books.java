package com.rays.oop;

import com.rays.oop.explicit.B;

public class Books {
	public static void main(String[] args) {
		System.out.println(Book.count + " ");
		Book b1 = new Book(150);
		Book b2 = new Book(200);
		System.out.println(Book.count);
	}

}

class Book{
	int price;
	static int count;
	
	public Book(int price) {
		this.price = price;
		count++;
	}
}