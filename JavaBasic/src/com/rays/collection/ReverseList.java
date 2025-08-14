package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

		for (int i = l.size() - 1; i >= 0; i--) {
			System.out.println(l.get(i));
		}
	}

}
