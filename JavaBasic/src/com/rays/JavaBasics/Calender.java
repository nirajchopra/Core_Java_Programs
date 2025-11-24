package com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender {

    public static void main(String[] args) throws ParseException {
        String s = "28/03/2024";

        // Create SimpleDateFormat with pattern
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Parse the date string
        Date d = sdf.parse(s);

        // Get Calendar instance and set the parsed date
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        // Add 30 days 1s2 times and print each result
        for (int i = 1; i <= 12; i++) {
            cal.add(Calendar.DATE, 30);
            System.out.println(sdf.format(cal.getTime()));
        }
    }
}
