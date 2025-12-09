package com.rays.JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrintCalender {
    public static void main(String[] args) throws Exception {
        String dateString = "28/03/2024";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dateString);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < 12; i++) {
            System.out.println(outputDateFormat.format(cal.getTime()));
            cal.add(Calendar.MONTH, 1); // Adding 1 month
        }
    }
}