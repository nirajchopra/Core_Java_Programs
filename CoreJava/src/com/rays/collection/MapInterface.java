package com.rays.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		
		h.put(1, "a");
		h.put(2, "b");
		h.put(3, "c");
		h.put(4, "d");
		h.put(5, "e");
		
		System.out.println("size : " + h.size());
		System.out.println("isEmpty : " + h.isEmpty());
		System.out.println("get 4: " + h.get(4));
		System.out.println("ContainsKey of 4 : " + h.containsKey(4));
		System.out.println("ContainsValue of d: " + h.containsValue("d"));
		
		System.out.println("------------------------------------------");
		
		TreeMap t = new TreeMap();
		
		t.put(1, "aaa");
		t.put(2, "bbb");
		t.put(3, "ccc");
		t.put(4, "ddd");
		t.put(5, "eee");
		
		System.out.println("firstKey : " + t.firstKey());
		System.out.println("lastKey : " + t.lastKey());
		System.out.println("firstEntry : " + t.firstEntry());
		System.out.println("lastEntry : " + t.lastEntry());
		
		System.out.println("------------------------------------------");
		
		LinkedHashMap l = new LinkedHashMap();
		
		l.put(1, "abc");
		l.put(2, "def");
		l.put(3, "xyz");
		l.put(4, "ghi");
		l.put(5, "jkl");
		
		System.out.println("get 2 : " + l.get(2));
		System.out.println("ContainsKey 1: " + l.containsKey(1));
		System.out.println("ContainsValue def: " + l.containsValue("def"));
		System.out.println("entrySet : " + l.entrySet());
		System.out.println("keySet : " + l.keySet());
		System.out.println("Value  : " + l.values());
		
	}

}
