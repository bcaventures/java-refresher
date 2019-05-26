package com.concurrency.thread;

public class AnotherThread extends Thread{
	
	@Override
	public void run()
	{
		System.out.println("This is " + currentThread().getName());
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(currentThread().getName() + " interrupted me");
		}
		System.out.println(currentThread().getName() + " is awake after 3 secs");
	}

}
