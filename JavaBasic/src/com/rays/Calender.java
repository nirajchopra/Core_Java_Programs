package com.rays;

import java.text.ParseException;
import java.util.Date;

public class Calender {
	private static final String DATE = null;

	public static void main(String[] args) throws ParseException {
		String s = "28/03/2024";
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date d = sdf.parse(s);
		Calender cal = Calender.getInstance();
		cal.seetTime(d);
		for(int i=1; i<=12; i++) {
			cal.add(Calender.DATE, 30);
			System.out.println(sdf.format(cal.getTime()));
		}
		
	}

	private static Calender getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	private void seetTime(Date d) {
		// TODO Auto-generated method stub
		
	}

	private Date getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String date2, int i) {
		// TODO Auto-generated method stub
		
	}

}
