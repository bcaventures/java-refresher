package com.concurrency.threadcounter;

public class ThreadCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDown countDown = new CountDown();

		Thread thread1 = new Thread( new CountDownThread(countDown));
		Thread thread2 = new Thread( new CountDownThread(countDown));
		
		thread1.setName("THREAD1");
		thread2.setName("THREAD2");
		
		thread1.start();
		thread2.start();
	}

}
