package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementException1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("banana");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//      Agar ab mai koi list add kar raha hu to exception dega (NoSuchElementException)
//      Kyuki ab koi item nahi hai add karne ko 
		try {
			System.out.println(it.next());
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
