package com.rays.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(80);
		list.add(100);
		
		System.out.println("List get : " + list.get(2));
		System.out.println("HashCode of list: " + list.hashCode());
		System.out.println("IndexOf of 80 : " + list.indexOf(80));
		System.out.println("SubList  : " + list.subList(0, 4));
		System.out.println("LastIndexOf : " + list.lastIndexOf(40));
		
		
		System.out.println("----------------------------------------------------");
		
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println("Element of LinkedList : " + l.element());
		System.out.println("GetFirst of LinkedList :  " + l.getFirst());
		System.out.println("GetLast of LinkedList : " + l.getLast());
		System.out.println("Peek : " + l.peek());
		System.out.println("FirstPeek : " + l.peekFirst());
		System.out.println("LastPeek : " + l.peekLast());
		System.out.println("Offer : " + l.offer(20));
		System.out.println("LinkedList : " + l);
		
		System.out.println("OfferFirst : " + l.offerFirst(100));
		System.out.println("OfferLast : " + l.offerLast(80));
		System.out.println("LinkedList : " + l);
		
		System.out.println("---------------------------------------------------- ");
		
		Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println("Empty : " + s.empty());
		System.out.println("Peek : " + s.peek());
		System.out.println("Search : " + s.search(5));
		System.out.println("pop : " + s.pop());
		
		System.out.println("----------------------------------------------------");
		
		Vector v = new Vector();
		
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		
		System.out.println("ElementAt : " + v.elementAt(2));
		System.out.println("SubList : " + v.subList(1, 3));
		System.out.println("Hashcode of vector : " + v.hashCode());
		System.out.println("Size  : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}

}
