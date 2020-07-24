package com.example.SpringCalculator;
import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class SpringCalculatorApplicationTests {

	@Test
	public void emptyStringReturnZero() {
		Assert.assertEquals(0, SpringCalculatorApplication.add(""));
	}
}
