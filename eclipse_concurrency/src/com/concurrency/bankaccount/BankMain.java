package com.concurrency.bankaccount;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final BankAccount bankAccount = new BankAccount("1ZY235789", 1000.00);
		
		/*
		 * Starts thread using an anonymous class declared from a thread instance
		 */

		Thread accountThread1 = new Thread() {
			public void run() {
				bankAccount.deposit(300.00);
				//System.out.println(Thread.currentThread().getName() + " deposited 300.00; balance is " + bankAccount.getBalance());
				bankAccount.withdraw(50.00);
				//System.out.println(Thread.currentThread().getName() + " withdrew 50.00; balance is " + bankAccount.getBalance());
			}
		};
		
		/*
		 * Starts thread using an anonymous class declared from a runnable interface
		 */
		
		Thread accountThread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				bankAccount.deposit(203.75);
				//System.out.println(Thread.currentThread().getName() + " deposited 203.75; balance is " + bankAccount.getBalance());
				bankAccount.withdraw(100.00);
				//System.out.println(Thread.currentThread().getName() + " withdrew 100.00; balance is " + bankAccount.getBalance());
			}
		});

		accountThread1.setName("THREAD1");
		accountThread2.setName("THREAD2");

		accountThread1.start();
		accountThread2.start();
		
		System.out.println("Account balance is " + bankAccount.getBalance());
	}
}
