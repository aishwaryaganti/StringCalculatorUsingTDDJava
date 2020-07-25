package com.example.SpringCalculator;
import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class SpringCalculatorApplicationTests {

	@Test
	// Return zero if there is empty String
	public void emptyStringReturnZero() {
		Assert.assertEquals(0, SpringCalculatorApplication.add(""));
	}
	@Test
	// Return number itself
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
	@Test
	// sum when values are comma delimited
	public void twoValuesWithCommaDelimiterReturnSum() {
		Assert.assertEquals(3,SpringCalculatorApplication.add("1,2"));
		Assert.assertEquals(8,SpringCalculatorApplication.add("5,3"));
		
	}
	@Test
	// Handling unknown amount of numbers
	public void unknownNumberOfValuesReturnSum() {
		Assert.assertEquals(6,SpringCalculatorApplication.add("1,2,3"));
		Assert.assertEquals(3,SpringCalculatorApplication.add("1,1,1"));
		Assert.assertEquals(24,SpringCalculatorApplication.add("7,10,7"));
	}
	@Test
	//New line is a valid Delimiter
	public void newLineIsValidDelimiter() {
		Assert.assertEquals(6,SpringCalculatorApplication.add("1\n2,3"));
		Assert.assertEquals(3,SpringCalculatorApplication.add("1\n2"));
	}
	@Test
	//Accept any custom delimiter
	public void differentDelimitersAreValidDelimiters() {
		Assert.assertEquals(6,SpringCalculatorApplication.add("//;\n1;2;3"));
		Assert.assertEquals(3,SpringCalculatorApplication.add("//p\n1p2"));
		//Regex values should also be accepted as delimiters
		Assert.assertEquals(5,SpringCalculatorApplication.add("//.\n3.2"));
		Assert.assertEquals(11,SpringCalculatorApplication.add("//*\n1*10"));
	}
	@Test
	//throw an exception “negatives not allowed” 
	public void negativeValuesRaiseException() {
		try {
			SpringCalculatorApplication.add("10,-1");
			fail("Negatives not allowed");
		}
		catch(RuntimeException ex) {
			//<<<< Exception caught >>>>"Negatives not allowed: "
		}
	}
	@Test
	//Show the negative numbers while throwing the exception
	public void negativeValuesRaiseExceptionByLoggingNegativeValues() {
		try {
			SpringCalculatorApplication.add("10,-1");
			fail("Negatives not allowed");
		}
		catch(RuntimeException ex) {
			Assert.assertEquals("Negatives not allowed: -1",ex.getMessage());
		}
	}
}
