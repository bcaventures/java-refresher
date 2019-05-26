package com.concurrency.thread;

import static com.concurrency.thread.ThreadColor.ANSI_GREEN;
import static com.concurrency.thread.ThreadColor.ANSI_PURPLE;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( ANSI_PURPLE + "This is the main thread");
		
		//starting a thread from a class that inherits Thread class
		Thread another = new AnotherThread();
		another.setName("EXTENDS_THREAD");
		another.start();

		//Starting a thread from an anonymous class that extends Thread and overrides run method
		Thread anotherThread = new Thread() {
			public void run() {
			System.out.println(ANSI_GREEN + "This is an anonymous thread");
			another.interrupt();
			}
		};
		anotherThread.start();
		
		//Starting a thread from class that implements Runnable interface
		Thread runnableThread = new Thread(new RunnableThread());
		runnableThread.start();
			
		//Starting a thread from an anonymous class that implements Runnable and overrides run method
		Thread anonymousRunnableThread = new Thread(new RunnableThread()) {
			@Override
			public void run() {
				System.out.println("Anonymous class overriding RunnableThread run");
			}
		};
		anonymousRunnableThread.start();

		System.out.println(ANSI_PURPLE + "This is the main thread again");
	}
}