/*
 * Thread class that will create a thread that will perform the countdown.
 */
package com.concurrency.threadcounter;

public class CountDownThread implements Runnable {
	
	private CountDown countDown;
	
	public CountDownThread(CountDown countDown) {
		this.countDown = countDown;
	}
	
	public void run() {
		countDown.performCountdown();
	}

}
