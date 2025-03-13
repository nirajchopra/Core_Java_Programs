package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		Collection co = new ArrayList();
		
		co.add("bura mat dekho");
		co.add("bura mat suno");
		co.add("bura mat bolo");
		
		System.out.println("Legth of Size: " + co.size());
		
		for (Object Obj1 : co) {
			System.out.println(Obj1);
			
		}
		Object[] oArray = co.toArray();
		
		for(Object Obj : oArray) {
			String s = (String) Obj;
			System.out.println(s);
		}
		
		
	}

	public static void shuffle(List<String> e) {
		// TODO Auto-generated method stub
		
	}

	

	

}
