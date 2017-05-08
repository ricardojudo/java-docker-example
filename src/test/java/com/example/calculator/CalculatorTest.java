package com.example.calculator;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		assertThat("Add 4 and 1", calculator.add(4, 1), equalTo(5));
	}

	@Test
	public void testSub() {
		assertThat("Sub 4 and 1", calculator.sub(4, 1), equalTo(3));
	}

	@Test
	public void testAbs() {
		assertThat("Abs -4", calculator.abs(-4), equalTo(4));
	}
	
	

}
