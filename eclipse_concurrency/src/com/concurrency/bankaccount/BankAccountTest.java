package com.concurrency.bankaccount;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	@Test
	public void getBalance_deposit() throws Exception {
		BankAccount bankAccount = new BankAccount("12345678", 1000.00);
		bankAccount.deposit(300.00);
		double balance = bankAccount.getBalance();
		assertEquals(1300, balance);
	}
}
