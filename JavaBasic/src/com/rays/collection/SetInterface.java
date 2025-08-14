package com.rays.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		HashSet h = new HashSet();

		h.add(100);
		h.add(200);
		h.add(99);
		h.add(40);
		h.add(17);
		h.add(55);

		System.out.println("contains 01 : " + h.contains(01));
		System.out.println("isEmpty : " + h.isEmpty());
		System.out.println("size : " + h.size());
		System.out.println("Remove : " + h.remove(01));
		System.out.println("HashSet : " + h);
		System.out.println("hashCode : " + h.hashCode());

		System.out.println("--------------------------------");

		TreeSet t = new TreeSet();

		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);

		System.out.println("contains : " + t.contains(3));
		System.out.println("ceiling : " + t.ceiling(3));
		System.out.println("first : " + t.first());
		System.out.println("pollFirst : " + t.pollFirst());
		System.out.println("TreeSet : " + t);
		System.out.println("size : " + t.size());
		System.out.println("pollLast : " + t.pollLast());
		System.out.println("TreeSet : " + t);

		System.out.println("---------------------------");

		LinkedHashSet l = new LinkedHashSet();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		System.out.println("contains : " + l.contains(2));
		System.out.println("isEmpty : " + l.isEmpty());
		System.out.println("size : " + l.size());
		System.out.println("remove : " + l.remove(4));
		System.out.println("LinkedHashSet : " + l);
		System.out.println("hashCode : " + l.hashCode());
		System.out.println("ToArray : " + l.toArray());

	}

}
