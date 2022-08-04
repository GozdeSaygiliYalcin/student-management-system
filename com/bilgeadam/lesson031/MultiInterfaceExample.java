package com.bilgeadam.lesson031;

public class MultiInterfaceExample implements Runnable {

	public static void main(String[] args) {
		MultiInterfaceExample m1 = new MultiInterfaceExample();
		
		Thread t1 = new Thread(m1, "Test Thread'i");
		t1.start();
		
		Thread[] threads = new Thread[10];
		for (int i = 0; i<threads.length; i++) {
			threads[i] = new Thread(m1, (i+1) + ". Thread");
			threads[i].start();
		}
	}

	@Override
	public void run() {
		
		System.out.println("Thread çalışıyor..." + Thread.currentThread().getName());
	}

}
