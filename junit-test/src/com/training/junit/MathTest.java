package com.training.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathTest {

	@BeforeEach
	void beforeTest()
	{
		System.out.println("Running this before each test");
	}
	
	@AfterEach
	void afterTest()
	{
		System.out.println("Running this afterN each test");
	}

	@Test
	void min() {
		int minNum = Math.min(10, 7);
		int expMin = 7;
		assertEquals(expMin, minNum);
	}

	@Test
	void max() {
		int minNum = Math.max(10, 7);
		int expMin = 10;
		assertEquals(expMin, minNum);
	}

	@Test
	void arrayTest() {
		String arrayString = "123 456 789";
		String [] splitStr = arrayString.split(" ");
		String [] expStr = {"123", "456", "789"};
		assertArrayEquals(expStr, splitStr);
		}
}