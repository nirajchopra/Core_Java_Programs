package com.rays.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {

        // Queue ka reference banaya, PriorityQueue implementation ke saath
        Queue queue = new PriorityQueue();

        // Queue me elements add kiye (offer() method use karke)
        // offer() element add karta hai aur true/false return karta hai
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.offer(400);

        // element() → front element ko dikhata hai (remove nahi karta)
        // agar queue empty hoti to exception deta
        System.out.println("queue.element() : " + queue.element());

        // peek() → front element ko dikhata hai (remove nahi karta)
        // agar queue empty hoti to null return karta
        System.out.println("queue.peek() : " + queue.peek());

        // poll() → front element ko dikhata hai aur remove bhi karta hai
        // agar queue empty hoti to null return karta
        System.out.println("queue.poll() : " + queue.poll());

        // remove() → front element ko dikhata hai aur remove bhi karta hai
        // agar queue empty hoti to exception deta
        System.out.println("queue.remove() : " + queue.remove());

        // Queue ka current status print karte hain
        // ab queue ke andar sirf [300, 400] bache honge
        System.out.println(queue);

        // remove(Object o) → specific element ko remove karta hai
        // yaha 200 ko remove karne ki koshish ho rahi hai (true ya false return karega)
        System.out.println("queue.remove(200) : " + queue.remove(200));

        // Queue ka final status print karte hain
        System.out.println(queue);

    }
}
