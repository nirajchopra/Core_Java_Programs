package com.rays.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {

		Queue queue = new PriorityQueue();

		queue.offer(100);
		queue.offer(200);
		queue.offer(300);
		queue.offer(400);

		System.out.println("queue.element() : " + queue.element());
		System.out.println("queue.peek() : " + queue.peek());
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.remove() : " + queue.remove());
		System.out.println(queue);
		System.out.println("queue.remove(200) : " + queue.remove(200));
		System.out.println(queue);

	}

}
