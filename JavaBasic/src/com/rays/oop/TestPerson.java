package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String name = p.getName();
        String address = p.getAddress();
        Date dob =  p.getDob();
        int AVG_AGE = p.getAvgAge();

        String s = "13-12-2002";
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        p.setName("Niraj Chopra");
        System.out.println(p.getName());
        p.setDob(d);
        System.out.println(p.getDob());
        p.setAddress("Rahadkot");
        System.out.println(p.getAddress());
    }
}
