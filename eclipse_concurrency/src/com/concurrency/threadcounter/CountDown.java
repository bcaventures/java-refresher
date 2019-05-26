/* 
 * Create a counter that the thread will use to count down
 */
package com.concurrency.threadcounter;

public class CountDown {
	private int counter;

	public synchronized void performCountdown() {
		
		/*
		 * With instance variable counter, the variable is stored on the heap, so it is shared by both threads.
		 * With local variable counter, the variable is stored on the thread stack, so it is available to only the thread
		 * Instance variables are created on the heap and local variables are created on the stack.
		 * Threads share the heap but each thread has its own copy of the thread stack.
		 */

		for (counter = 10; counter > 0; counter--)
		{
			System.out.println(Thread.currentThread().getName() + " : " + counter);
		}
	}
}
