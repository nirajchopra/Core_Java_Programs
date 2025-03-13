package com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestStringDate {
    public static void main(String[] args) throws ParseException {
    	
    	Date d = new Date();
    	
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	
    	System.out.println("Date: " + d);
    	
    	Calendar cal = Calendar.getInstance();
    	
    	cal.add(Calendar.DATE, 20);
    	
    	System.out.println(sdf.format(cal.getTime()));

        String dateString = "09/04/2024";

        Date date = sdf.parse(dateString);

        System.out.println(date + " (String To date)");

        String stringDate = sdf.format(date);

        System.out.println(stringDate + " (date To String)");
    }
}