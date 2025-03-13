package com.rays.concurrencyandthreads;

public class BackgroundThread  extends Thread{
	
	String name = null;
	
	public BackgroundThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(name);
		}
	}
}
