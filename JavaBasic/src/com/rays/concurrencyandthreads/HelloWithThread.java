package com.rays.concurrencyandthreads;

public class HelloWithThread extends Thread {
	private String name = null;
	
	public HelloWithThread(String n) {
		this.name = name;
	}
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.println(i + "#" + name);
		}
	}
	
	public static void main(String[] args) {
		HelloWithThread t1 = new HelloWithThread("Ram");
		HelloWithThread t2 = new HelloWithThread("Shyam");
		
		t1.start();
		t2.start();
		
		for(int i = 0; i< 500; i++) {
			System.out.println(i + "I am Main");
		}
	}

}
