package com.concurrency.bankaccount;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private double balance;
	private String accountNumber;
	private ReentrantLock lock;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.lock = new ReentrantLock();
	}
	
	public void deposit(double amount) {
		//use lock and tryLock to get the lock
		try {
			if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				try {
					balance = balance + amount;
				}
				finally {
					lock.unlock();
				}
			}
			else {
				System.out.println("Could not get the lock for deposit");
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void withdraw(double amount) {
		//use lock and tryLock to get the lock
		//lock.lock();
		try {
			if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) { 
				try {
					balance = balance - amount;
				}
				finally {
					lock.unlock();
				}
			}
			else {
				System.out.println("Could not get the lock for withdrawal");
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	//There is no need to synchronize read-only methods
	public double getBalance() {
		
		synchronized(this){
		return balance;
		}
	}
	
	//There is no need to synchronize read-only methods
	public String getAccountNumber() {
		return accountNumber;
	}

	//There is no need to synchronize read-only methods
	public void printAccountNumber() {
		System.out.println("Account number is " + accountNumber);
	}
}
