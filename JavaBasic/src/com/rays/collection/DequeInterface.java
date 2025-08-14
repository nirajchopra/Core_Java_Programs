package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
	public static void main(String[] args) {
		Deque d = new ArrayDeque() ;
		
		d.offer(100);
		d.offer(200);
		d.offer(300);
		d.offer(400);
		d.offer(500);
		
		System.out.println("Deque getFirst : " + d.getFirst());
		System.out.println("Deque peek : " + d.peek());
		System.out.println("Deque poll : " + d.poll());
		System.out.println("Deque pop : " + d.pop());
		System.out.println("Deque pollFirst : " + d.pollFirst());
		System.out.println("Deque pollLast : " + d.pollLast());
		System.out.println("Deque : " + d);
		
		
	}

}
