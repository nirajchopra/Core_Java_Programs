package com.rays.oop.person;

import java.text.ParseException;
import java.util.Date;

import com.rays.SimpleDateFormat;


public class TestPersonByInterface implements PersonByInterface{
	
	public  String Aa(String name, int age, Date date) {
		return name + age + date;
	}
	
	public static void main(String args[]) throws ParseException{
		TestPersonByInterface p = new TestPersonByInterface();
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		String s = p.Aa(name, age, "13-12-2002");
		System.out.println(s);
		
	}

}
