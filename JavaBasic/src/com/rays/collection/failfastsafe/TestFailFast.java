package com.rays.collection.failfastsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	
	public static void main(String args[]) {
		
		List list = new ArrayList(); //  ArrayList banayi

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');

		Iterator it = list.iterator(); //  Iterator banaya purani list par

		list.add(100); //  Iterator banne ke baad list ko modify kiya

		while(it.hasNext()) {
		    System.out.println(it.next()); //  Ye line fail-fast exception throw karegi
		}

	}

}
