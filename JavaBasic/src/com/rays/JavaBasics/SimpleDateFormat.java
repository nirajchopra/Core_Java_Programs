package com.rays;

import java.util.Date;

public class SimpleDateFormat {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(d);
		System.out.println(s);
		
	}

	public String format(Date d) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object parse(String str) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
