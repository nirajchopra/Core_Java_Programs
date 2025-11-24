package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AddOffer {

public static void main(String[] args) {
		
		Queue q1 = new ArrayBlockingQueue(2);
		q1.offer(1);
		q1.offer(2);
		q1.offer(3); //nahi chalega
	//	q1.offer(null);   // nhi chlega
		
		System.out.println(q1);
		try {
//		Queue q = new ArrayBlockingQueue(2);
		
		q1.add(4);
		q1.add(5);    // upper wala Queue chlega ye nhi chlega
		q1.add(6);
	System.out.println(q1);
		}catch (IllegalStateException e) {
			System.out.println(e);
		}
		// we use Iterator to iterate
		
//		Queue q2 = new PriorityQueue();
//		q2.offer(3);
//		q2.offer(4);
//		System.out.println(q2.poll());
	}
}
