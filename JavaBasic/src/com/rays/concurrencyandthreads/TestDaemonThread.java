package com.rays.concurrencyandthreads;

public class TestDaemonThread {
	public static void main(String[] args) {
		BackgroundThread t1 = new BackgroundThread("Deomaon Thread");
		t1.setDaemon(true);
		
		t1.start();
		for(int i=1; i<=50; i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();

			}
			System.out.println(i + " main");
		}
	}

}
