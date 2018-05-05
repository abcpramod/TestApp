package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.app.HelloCalculate;

public class HelloTest {

	@Test
	public void testApp() {
		assertEquals(0, new HelloCalculate().calSomething());
	}
}
