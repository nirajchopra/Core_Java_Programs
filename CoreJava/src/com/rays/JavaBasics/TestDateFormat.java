package com.rays.JavaBasics;

import java.util.*;
import java.text.SimpleDateFormat;

public class TestDateFormat {
	public static void main(String args[]) {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("21/03/2024");
		String str = format.format(d);
		System.out.println("Date: " + str);

	}

}
