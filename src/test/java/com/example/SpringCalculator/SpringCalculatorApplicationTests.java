package com.example.SpringCalculator;
import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class SpringCalculatorApplicationTests {

	@Test
	public void emptyStringReturnZero() {
		Assert.assertEquals(0, SpringCalculatorApplication.add(""));
	}
	@Test
	public void singleValueReturnsValueItself() {
		Assert.assertEquals(1, SpringCalculatorApplication.add("1"));
		Assert.assertEquals(2, SpringCalculatorApplication.add("2"));
		Assert.assertEquals(3, SpringCalculatorApplication.add("3"));
		Assert.assertEquals(4, SpringCalculatorApplication.add("4"));
		Assert.assertEquals(5, SpringCalculatorApplication.add("5"));
		Assert.assertEquals(6, SpringCalculatorApplication.add("6"));
		Assert.assertEquals(7, SpringCalculatorApplication.add("7"));
		Assert.assertEquals(8, SpringCalculatorApplication.add("8"));
		Assert.assertEquals(9, SpringCalculatorApplication.add("9"));
	}
}
