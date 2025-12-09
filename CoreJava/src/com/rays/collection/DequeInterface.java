package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
    public static void main(String[] args) {
        // Deque (Double Ended Queue) ka object banaya
        // ArrayDeque implementation use karke
        Deque d = new ArrayDeque();
        
        // Elements add kiye (by default tail me add hote hain)
        d.offer(100);
        d.offer(200);
        d.offer(300);
        d.offer(400);
        d.offer(500);
        
        // getFirst() → Deque ka first element return karega bina remove kiye
        // Agar deque empty hai to exception throw karega
        System.out.println("Deque getFirst : " + d.getFirst()); // 100
        
        // peek() → head element (front element) return karega bina remove kiye
        // Agar deque empty hai to null return karega
        System.out.println("Deque peek : " + d.peek()); // 100
        
        // poll() → head element (front element) return karega aur remove bhi karega
        // Agar deque empty hai to null return karega
        System.out.println("Deque poll : " + d.poll()); // 100 remove ho jayega
        
        // pop() → stack jaisa kaam karta hai (LIFO principle)
        // head element ko remove karke return karta hai
        // Agar deque empty hai to exception throw karega
        System.out.println("Deque pop : " + d.pop()); // 200 remove ho jayega
        
        // pollFirst() → pehla (first/head) element return karke remove karega
        // Agar deque empty hai to null return karega
        System.out.println("Deque pollFirst : " + d.pollFirst()); // 300 remove ho jayega
        
        // pollLast() → last element return karke remove karega
        // Agar deque empty hai to null return karega
        System.out.println("Deque pollLast : " + d.pollLast()); // 500 remove ho jayega
        
        // Ab deque me bacha hua data print karenge
        System.out.println("Deque : " + d); // [400]
    }
}
