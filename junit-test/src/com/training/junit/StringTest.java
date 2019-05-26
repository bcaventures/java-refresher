package com.training.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		int len = "Beltus".length();
		int expLen = 6;
		assertEquals(expLen, len);
	}

}
