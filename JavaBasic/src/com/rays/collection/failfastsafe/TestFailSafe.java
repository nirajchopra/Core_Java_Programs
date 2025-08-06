package com.rays.collection.failfastsafe;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {

		//  Vector banayi (legacy thread-safe collection)
		Vector v = new Vector();

		v.add('a');
		v.add('b');
		v.add('c');
		v.add('d');
		v.add('e');

		//  Enumeration banaya vector ke elements par iterate karne ke liye
		Enumeration e = v.elements();

		//  Enumeration banne ke baad bhi vector me element add kiya
		v.add(100); //  Agar yeh ArrayList hota to fail-fast exception deta

		//  Lekin Enumeration ke through safely iterate kiya
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
